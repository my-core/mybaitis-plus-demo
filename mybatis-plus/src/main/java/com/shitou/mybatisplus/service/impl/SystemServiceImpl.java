package com.shitou.mybatisplus.service.impl;

import com.shitou.mybatisplus.mapper.SysAdminMapper;
import com.shitou.mybatisplus.entity.SysAdmin;
import com.shitou.mybatisplus.service.SystemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemServiceImpl implements SystemService {

    private SysAdminMapper _sysAdminMapper;
    public  SystemServiceImpl(SysAdminMapper sysAdminMapper){
        _sysAdminMapper=sysAdminMapper;
    }

    public List<SysAdmin> getSysAdminList(){
        return _sysAdminMapper.selectList(null);
    }
}

