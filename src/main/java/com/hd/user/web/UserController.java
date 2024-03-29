package com.hd.user.web;

import com.hd.user.domain.User;
import com.hd.user.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "新增用户",notes = "新增用户")
    @PostMapping("/insertUser")
    public void insertUser(@RequestBody @ApiParam(name = "user",value = "用户对象",required = true) User user){
        userInfoService.insertUser(user);
    }

    @ApiOperation(value = "修改用户信息",notes = "修改用户信息")
    @PostMapping("/updateUser")
    public void updateUser(@RequestBody @ApiParam(name = "user",value = "用户对象",required = true) User user){
        userInfoService.updateUser(user);
    }
}
