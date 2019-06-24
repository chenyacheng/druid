package com.chenyacheng.druid.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	/**
	 * 用户名.
	 */
	@Column(name = "user_name")
	private String userName = "";

	/**
	 * 手机号码.
	 */
	@Column(name = "mobile_no")
	private String mobileNo = "";

	/**
	 * 邮箱.
	 */
	@Column(name = "email")
	private String email = "";

	/**
	 * 密码.
	 */
	@Column(name = "password")
	private String password = "";

	/**
	 * 所在区域.
	 */
	@Column(name = "region")
	private String region = "";

	/**
	 * 注册时间.
	 */
	@Column(name = "create_time")
	private Date createTime = new Date();

	/**
	 * 更新时间..
	 */
	@Column(name = "update_time")
	private Date updateTime = new Date();

	public User() {}
	
	public User(String userName, String mobileNo, String email, String password, String region) {
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.region = region;
	}

	public void setUpdateTime(Date date) {
		updateTime = date;
	}
}