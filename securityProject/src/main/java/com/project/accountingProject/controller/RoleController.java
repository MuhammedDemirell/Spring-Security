package com.project.accountingProject.controller;

import com.project.accountingProject.model.entity.Role;
import com.project.accountingProject.model.entity.User;
import com.project.accountingProject.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
