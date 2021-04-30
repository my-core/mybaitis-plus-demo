package com.shitou.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shitou.mybatisplus.entity.SysAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysAdminMapper extends BaseMapper<SysAdmin> {
    List<SysAdmin> getSysAdminList();
}
