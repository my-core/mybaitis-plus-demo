package com.shitou.mybatisplus.controller;

import com.shitou.mybatisplus.entity.SysAdmin;
import com.shitou.mybatisplus.service.SystemService;
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
    public List<SysAdmin> getSysAdminList() {
        return _systemService.getSysAdminList();
    }
}
