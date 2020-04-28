package jp.co.internous.ecsite.model.dto;

import jp.co.internous.ecsite.model.entity.User;

//���O�C������java����controller��
public class LoginDto {
	
//�t�B�[���h�i�n�����j
	
	private long id;
	
	private String userName ;
	
	private String password;
	
	private String fullName;
	
//�f�t�H���g�R���X�g���N�^
	public LoginDto() {}

//user�G���e�B�e�B��������󂯎��Z�b�g����R���X�g���N�^
	public LoginDto(User user) {
		this.id=user.getId();
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.fullName=user.getFullName();
	}

//�������󂯎������Z�b�g����R���X�g���N�^
	public LoginDto(long id,String userName,String password,String fullName) {
		this.id=id;
		this.userName=userName;
		this.password=password;
		this.fullName=fullName;
	}

	
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
	}
	


