package com.chenyacheng.druid.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chenyacheng.druid.pojo.User;

public interface UserRepos extends JpaRepository<User, String> {

    /**
     * 通过用户名相等查询
     *
     * @param userName 用户名
     * @return
     */
    List<User> findByUserName(String userName);

    /**
     * 通过名字like查询
     *
     * @param userName 用户名
     * @return
     */
    List<User> findByUserNameLike(String userName);

    /**
     * 通过用户名和手机号码查询
     *
     * @param userName 用户名
     * @param mobileNo 手机号码
     * @return
     */
    User findByUserNameAndMobileNo(String userName, String mobileNo);

}
