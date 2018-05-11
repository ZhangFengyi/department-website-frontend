package com.baohao.departmentwebsitefrontend.common.realm;

import com.baohao.departmentwebsitefrontend.common.GlobalConfigurations;
import com.baohao.departmentwebsitefrontend.common.constant.SessionConstants;
import com.baohao.departmentwebsitefrontend.common.util.EncryptUtils;
import com.baohao.departmentwebsitefrontend.model.UserInfo;
import com.baohao.departmentwebsitefrontend.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class ShiroDBRealm extends AuthorizingRealm {
    private Logger logger = LoggerFactory.getLogger("loginLogger");

    @Resource
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        String name = (String) principals.fromRealm(getName()).iterator().next();
        if (StringUtils.isBlank(name)) {
            return null;
        }
        Subject subject = SecurityUtils.getSubject();
        UserInfo userInfo = (UserInfo) subject.getSession().getAttribute(SessionConstants.ATTR_USER);
        if (userInfo == null || userInfo.getUserEmail().equalsIgnoreCase(name)) {
            userInfo = userService.findUserByEmail(name);
        }
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String email = usernamePasswordToken.getUsername();
        String password = String.valueOf(usernamePasswordToken.getPassword());
        UserInfo userInfo = userService.findUserByEmail(email);
        if (userInfo == null) {
            logger.warn("Not exists user is trying to login, user email: " + email);
            throw new UnknownAccountException("User does not exist!");
        }
        if (GlobalConfigurations.isReleaseMode()) {
            if (!StringUtils.equals(EncryptUtils.md5Encrypt(password).toString(), userInfo.getUserPsw())) {
                logger.warn("Wrong password input, email: " + email + " password: " + password);
                throw new IncorrectCredentialsException("Incorrect password");
            }
        }
        SecurityUtils.getSubject().getSession().setAttribute(SessionConstants.ATTR_USER, userInfo);
        logger.info("User login, email: " + email);
        return new SimpleAuthenticationInfo(email, password, getName());
    }
}
