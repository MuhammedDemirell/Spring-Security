package com.project.securityProject.controller;

import com.project.securityProject.model.entity.User;
import com.project.securityProject.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public List<User> list(){
        return userService.list();
    }
    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @PatchMapping
    public void addRoles(@RequestBody AddRoleRequest request){
        userService.addRoleToUser(request.getUsername(), request.getRole());
    }

    @Data
    class AddRoleRequest{
        private String username;
        private String role;
    }


}
