package com.shitou.mybatis.mapper;

import com.shitou.mybatis.model.SysAdminInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysAdminMapper {
    List<SysAdminInfo> getSysAdminList();
}
