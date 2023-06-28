package com.project.securityProject.controller;

import com.project.securityProject.model.entity.Role;
import com.project.securityProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RoleController {

    private final UserService userService;

    @PatchMapping
    public Role save(@RequestBody Role role){

        return userService.save(role);

    }



}
