package com.baohao.departmentwebsitefrontend.service;

import com.baohao.departmentwebsitefrontend.dao.VisitInfoMapper;
import com.baohao.departmentwebsitefrontend.model.UserInfo;
import com.baohao.departmentwebsitefrontend.model.VisitInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class VisitService {
    @Resource
    private VisitInfoMapper visitInfoMapper;

    public void addVisitInfo(UserInfo userInfo) {
        VisitInfo add = new VisitInfo();
        add.setVisitUserId(userInfo.getUserId());
        add.setVisitCount(1);
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        add.setVisitTime(date);
        visitInfoMapper.insertSelective(add);
    }
}
