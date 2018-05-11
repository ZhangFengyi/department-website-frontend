package com.baohao.departmentwebsitefrontend.service;

import com.baohao.departmentwebsitefrontend.dao.UserInfoMapper;
import com.baohao.departmentwebsitefrontend.model.UserInfo;
import com.baohao.departmentwebsitefrontend.model.UserInfoExample;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserInfoMapper userInfoMapper;

    public UserInfo findUserByEmail(String email) {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andUserEmailEqualTo(email);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userInfoList)) {
            return null;
        }
        return userInfoList.get(0);
    }
}
