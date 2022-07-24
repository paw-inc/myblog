package com.pawinc.myblog.service;

import com.pawinc.myblog.model.Role;

import java.util.List;


public interface RoleService {
    Role create(Role user);
    Role readById(long id);
    Role update(Role user);
    void delete(long id);

    List<Role> getAll();
}
