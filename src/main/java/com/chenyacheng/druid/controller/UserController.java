package com.chenyacheng.druid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chenyacheng.druid.pojo.User;
import com.chenyacheng.druid.repository.UserRepos;

@RestController
public class UserController {

	@Autowired
	private UserRepos userRepos;

	@RequestMapping("/saveUser")
	public User saveUser(String userName, String mobileNo, String email, String password, String region) {
		// http://localhost:8080/saveUser?userName=111&mobileNo=121312321&email=3234234&password=1111111111&region=hainan
		System.out.println("数据添加成功");
		return userRepos.save(new User(userName, mobileNo, email, password, password));
	}

	@RequestMapping("/findByUserName")
	public List<User> findByUserName(String userName) {
		return userRepos.findByUserName(userName);
	}

	@RequestMapping("/findByUserNameLike")
	public List<User> findByUserNameLkie(String userName) {
		return userRepos.findByUserNameLike(userName);
	}

}
