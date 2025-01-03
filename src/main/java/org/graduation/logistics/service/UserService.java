package org.graduation.logistics.service;

import org.graduation.logistics.entity.bo.CustomerBo;
import org.graduation.logistics.entity.bo.UserBo;
import org.graduation.logistics.entity.pojo.Role;
import org.graduation.logistics.entity.pojo.RolePermission;
import org.graduation.logistics.entity.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
    boolean checkLoginAccount(String account);
    List<UserBo> selectUsersByCompanyId(int companyId, int language);
    List<CustomerBo> selectCustomersByStoreId(int storeId, int language);
    UserBo selectUserByUserId(int userId,int language);
    CustomerBo selectCustomerByStoreIdAndUserId(int storeId,int userId,int language);
    boolean login(int userId, String password);
    int addRole(Role role);
    int deleteRole(int roleId);
    int addRoleToUser(int userId,int roleId);
    int updateRole(Role role);
    int addRolePermission(RolePermission rolePermission);
    int deleteRolePermission(int roleId,int permissionId);
    int updateRolePermission(RolePermission rolePermission);
    List<RolePermission> selectRolePermissionByRoleId(int roleId);
    boolean checkRolePermission(int userId,int permissionCode);
}
