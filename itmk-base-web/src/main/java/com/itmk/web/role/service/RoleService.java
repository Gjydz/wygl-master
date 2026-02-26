package com.itmk.web.role.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itmk.web.role.entity.*;

import java.io.Serializable;

/**
 * @Classname RoleService
 * @Description 角色service层
 */
public interface RoleService extends IService<Role> {
    //分页查询
    IPage<Role> list(RoleParm roleParm);
    //查询分配权限树回显
    RolePermissionVo getAssignTree(RoleAssignParm parm);
    //保存权限
    void saveAssign(RolePermissionParm parm);
    //删除角色并删除角色所分配的权限
    boolean removeRoleById(Serializable id);
}
