package com.CRUDproject.CRUDp.service;

import com.CRUDproject.CRUDp.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId) throws Exception;
}
