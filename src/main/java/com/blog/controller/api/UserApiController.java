package com.blog.controller.api;

import com.blog.DTO.ResponseDTO;
import com.blog.service.UserService;
import com.blog.table.RoleType;
import com.blog.table.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;


    @PostMapping("/api/user")
    public ResponseDTO<Integer> save(@RequestBody User user){
            System.out.println("test : save response");
            user.setRole(RoleType.USER);
            userService.회원가입(user);
        return new ResponseDTO<Integer>(HttpStatus.OK.value(),1);
    }

}