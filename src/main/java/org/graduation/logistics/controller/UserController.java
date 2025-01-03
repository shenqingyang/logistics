package org.graduation.logistics.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.graduation.logistics.entity.bo.UserBo;
import org.graduation.logistics.entity.enums.PermissionCodeEnum;
import org.graduation.logistics.entity.pojo.User;
import org.graduation.logistics.entity.vo.ResponseVo;
import org.graduation.logistics.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "用户")
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public ResponseVo login(Integer userId,Integer language, String password){
        if(userId == null || password == null || language == null)
            return ResponseVo.error("参数错误");
        if(!userService.login(userId,password))
            return ResponseVo.error("账号或密码错误");
        UserBo user = userService.selectUserByUserId(userId,language);
        return ResponseVo.success(user);
    }

    @PostMapping("/register")
    @Operation
    public ResponseVo register(@RequestBody User user){
        if(user == null)
            return ResponseVo.error("用户信息错误");
        if(user.getLoginAccount() == null || userService.checkLoginAccount(user.getLoginAccount()))
            return ResponseVo.error("用户登录账户错误");
        if(userService.addUser(user) == 1)
            return ResponseVo.success("注册成功");
        return ResponseVo.error("注册失败");
    }

    @DeleteMapping("/user")
    public ResponseVo deleteUser(@RequestParam int userId,@RequestParam int deleteUserId){
        if(!userService.checkRolePermission(userId, PermissionCodeEnum.MANAGE_COMPANY_STUFF.getCode()) &&
            !userService.checkRolePermission(userId,PermissionCodeEnum.MANAGE_STORE_STUFF.getCode()))
            return ResponseVo.error("没有权限");
        userService.deleteUser(deleteUserId);
        return  ResponseVo.success();
    }

    @PutMapping("/user")
    public ResponseVo updateUser(@RequestBody User user,@RequestParam int userId){
        if(!userService.checkRolePermission(userId, PermissionCodeEnum.MANAGE_COMPANY_STUFF.getCode()) &&
                !userService.checkRolePermission(userId,PermissionCodeEnum.MANAGE_STORE_STUFF.getCode()))
            return ResponseVo.error("没有权限");
        userService.updateUser(user);
        return ResponseVo.success();
    }

    @PostMapping("/selectStaffsByCompanyId")
    public ResponseVo selectStaffsByCompanyId(@RequestParam int companyId,@RequestParam int userId,@RequestParam int language) {
        if (userService.checkRolePermission(userId, PermissionCodeEnum.MANAGE_COMPANY_STUFF.getCode())) {
            return ResponseVo.success(userService.selectUsersByCompanyId(companyId, language));
        }
        return ResponseVo.error("没有权限");
    }

    @PostMapping("/selectCustomersByStoreId")
    public ResponseVo selectCustomersByStoreId(@RequestParam int storeId,@RequestParam int userId,@RequestParam int language) {
        if (userService.checkRolePermission(userId, PermissionCodeEnum.MANAGE_STORE_STUFF.getCode())) {
            return ResponseVo.success(userService.selectCustomersByStoreId(storeId, language));
        }
        return ResponseVo.error("没有权限");
    }

    @@PostMapping("/role/add")
    public ResponseVo addRole(){

    }




}
