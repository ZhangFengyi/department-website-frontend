package com.baohao.departmentwebsitefrontend.service;

import com.baohao.departmentwebsitefrontend.dao.FnInfoMapper;
import com.baohao.departmentwebsitefrontend.model.FnInfo;
import com.baohao.departmentwebsitefrontend.model.FnInfoExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    private FnInfoMapper fnInfoMapper;

    public List<FnInfo> getSortedFnInfoList() {
        FnInfoExample example = new FnInfoExample();
        example.setOrderByClause("`fn_number` ASC, `fn_id` ASC");
        List<FnInfo> fnInfoList = fnInfoMapper.selectByExample(example);
        return fnInfoList;
    }
}
