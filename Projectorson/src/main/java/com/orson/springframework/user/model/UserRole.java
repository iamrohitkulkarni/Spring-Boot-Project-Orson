package com.orson.springframework.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Rohit Kulkarni. 19-Dec-2018 Projectorson
 *
 */
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "tbl_user_role")
public class UserRole implements Serializable {
	private static final long serialVersionUID = -1151746256732175194L;
	private Integer id;
	private String name;
	private Integer createdBy;
	private Integer createTime;
	private Long writeTime;
	private Integer writeUserId;
	private Integer isActive;
	private String roleComment;

	public UserRole() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "create_user_id")
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "create_time")
	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	@Column(name = "write_time")
	public Long getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(Long writeTime) {
		this.writeTime = writeTime;
	}

	@Column(name = "write_user_id")
	public Integer getWriteUserId() {
		return writeUserId;
	}

	public void setWriteUserId(Integer writeUserId) {
		this.writeUserId = writeUserId;
	}

	@Column(name = "is_active")
	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Column(name = "role_comment")
	public String getRoleComment() {
		return roleComment;
	}

	public void setRoleComment(String roleComment) {
		this.roleComment = roleComment;
	}

}
