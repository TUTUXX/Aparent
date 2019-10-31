package com.myao.userweb1.service;

import com.myao.userweb1.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定id用户信息
    public User getUser(Long id);
    //更新指定id用户信息
    public void updateUser(Long id,User user);
    //删除指定id用户
    public void deleteUser(Long id);

    public Map getUserMap();

}
