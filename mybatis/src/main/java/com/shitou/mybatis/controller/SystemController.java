package com.shitou.mybatis.controller;

import com.shitou.mybatis.model.SysAdminInfo;
import com.shitou.mybatis.service.SystemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/sys")
public class SystemController {

    private SystemService _systemService;
    public  SystemController(SystemService systemService) {
        _systemService = systemService;
    }

    @GetMapping("/adminList")
    public List<SysAdminInfo> getSysAdminList() {
        return _systemService.getSysAdminList();
    }
}
