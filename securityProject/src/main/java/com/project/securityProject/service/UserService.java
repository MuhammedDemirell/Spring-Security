package com.project.securityProject.service;

import com.project.securityProject.model.entity.Role;
import com.project.securityProject.model.entity.User;

import java.util.List;

public interface UserService {

    User save(User user);
    Role save(Role role);
    void addRoleToUser(String username, String role);
    User getUser(String username);
    List<User> list();
}
