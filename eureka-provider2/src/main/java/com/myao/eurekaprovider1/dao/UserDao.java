package com.myao.eurekaprovider1.dao;

import com.myao.eurekaprovider1.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {
}
