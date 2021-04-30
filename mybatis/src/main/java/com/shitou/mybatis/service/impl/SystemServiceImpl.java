package com.shitou.mybatis.service.impl;

import com.shitou.mybatis.mapper.SysAdminMapper;
import com.shitou.mybatis.model.SysAdminInfo;
import com.shitou.mybatis.service.SystemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    private SysAdminMapper _sysAdminMapper;
    public  SystemServiceImpl(SysAdminMapper sysAdminMapper){
        _sysAdminMapper=sysAdminMapper;
    }

    public List<SysAdminInfo> getSysAdminList(){
        return _sysAdminMapper.getSysAdminList();
    }
}
