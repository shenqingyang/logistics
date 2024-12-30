package org.graduation.logistics.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import jakarta.annotation.Resource;
import org.graduation.logistics.dao.RoleDao;
import org.graduation.logistics.dao.RolePermissionDao;
import org.graduation.logistics.dao.UserDao;
import org.graduation.logistics.entity.bo.CustomerBo;
import org.graduation.logistics.entity.bo.UserBo;
import org.graduation.logistics.entity.pojo.Role;
import org.graduation.logistics.entity.pojo.RolePermission;
import org.graduation.logistics.entity.pojo.User;
import org.graduation.logistics.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Resource
    private RoleDao roleDao;
    @Resource
    private RolePermissionDao rolePermissionDao;
    @Override
    public int addUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateById(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDao.deleteById(userId);
    }

    @Override
    public boolean checkLoginAccount(String account) {
        return userDao.selectCount(new LambdaQueryWrapper<User>().eq(User::getLoginAccount, account)) > 0;
    }

    @Override
    public List<UserBo> selectUsersByCompanyId(int companyId, int language) {
        return userDao.selectUserBosByCompanyId(companyId,language);
    }

    @Override
    public List<CustomerBo> selectCustomersByStoreId(int storeId, int language) {
        return userDao.selectCustomerBosByStoreId(storeId,language);
    }

    @Override
    public UserBo selectUserByUserId(int userId, int language) {
        return userDao.selectUserBoByUserId(userId,language);
    }

    @Override
    public CustomerBo selectCustomerByStoreIdAndUserId(int storeId, int userId, int language) {
        return userDao.selectCustomerBoByStoreIdAndUserId(storeId,userId,language);
    }

    @Override
    public boolean login(int userId, String password) {
        User user = userDao.selectById(userId);
        if(user == null || user.getPassword() == null || !user.getPassword().equals(password))
            return false;
        return true;
    }

    @Override
    public int addRole(Role role) {
        return roleDao.insert(role);
    }

    @Override
    public int deleteRole(int roleId) {
        return roleDao.deleteById(roleId);
    }

    @Override
    public int addRoleToUser(int userId, int roleId) {
        User user = userDao.selectById(userId);
        user.setRoleId(roleId);
        return userDao.updateById(user);
    }

    @Override
    public int updateRole(Role role) {
        return roleDao.updateById(role);
    }

    @Override
    public int addRolePermission(RolePermission rolePermission) {
        if(rolePermissionDao.selectCount(new LambdaQueryWrapper<RolePermission>().eq(RolePermission::getRoleId,rolePermission.getRoleId()).eq(RolePermission::getPermissionCode,rolePermission.getPermissionCode())) > 0){
            return 0;
        }
        return rolePermissionDao.insert(rolePermission);
    }

    @Override
    public int deleteRolePermission(int roleId,int permissionCode) {
        LambdaQueryWrapper<RolePermission> wrapper = new LambdaQueryWrapper<>();
        return rolePermissionDao.delete(wrapper.eq(RolePermission::getRoleId,roleId).eq(RolePermission::getPermissionCode,permissionCode));
    }

    @Override
    public int updateRolePermission(RolePermission rolePermission) {
        return rolePermissionDao.updateById(rolePermission);
    }

    @Override
    public List<RolePermission> selectRolePermissionByRoleId(int roleId) {
        return rolePermissionDao.selectList(new LambdaQueryWrapper<RolePermission>().eq(RolePermission::getRoleId,roleId));
    }

    @Override
    public boolean checkRolePermission(int roleId, int permissionCode) {
        return rolePermissionDao.selectCount(new LambdaQueryWrapper<RolePermission>().eq(RolePermission::getRoleId,roleId).eq(RolePermission::getPermissionCode,permissionCode)) > 0;
    }
}
