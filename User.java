package jp.co.internous.ecsite.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//goods�e�[�u���ɃA�N�Z�X����N���X
@Entity
@Table(name="user")
public class User {
	
//�t�B�[���h�i�e�[�u���̃J�����j
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="isAdmin")
	private int isAdmin;
	
	
//���N���X����g����悤�ɂ���
	//id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	
	//userName
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	//password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	//fullName
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	
	//isAdmin
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin=isAdmin;
	}
}
