package com.shitou.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * mybatis-plus会根据驼峰转换sql语句，这里需用TableName、TableId、TableField指定表名、主键、字段名
 */
public class SysAdmin {
    @TableId(value = "ID",type=IdType.AUTO)
    private String ID;
    @TableField("AdminName")
    private String AdminName;
    @TableField("Password")
    private String Password;
    @TableField("RealName")
    private String RealName;
    @TableField("RoleID")
    private String RoleID;
    @TableField("IsSuper")
    private String IsSuper;
    @TableField("Status")
    private String Status;
    @TableField("CreateBy")
    private String CreateBy;
    @TableField("CreateTime")
    private String CreateTime;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String adminName) {
        AdminName = adminName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String realName) {
        RealName = realName;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String roleID) {
        RoleID = roleID;
    }

    public String getIsSuper() {
        return IsSuper;
    }

    public void setIsSuper(String isSuper) {
        IsSuper = isSuper;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }
}
