package com.myao.eurekaprovider1.Service.impl;

import com.myao.eurekaprovider1.Service.UserService;
import com.myao.eurekaprovider1.bean.User;
import com.myao.eurekaprovider1.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getUserList() {
        System.out.println("provider1中service层getUserList方法"+"----时间"+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return userDao.findAll();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userDao.saveAndFlush(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
}
