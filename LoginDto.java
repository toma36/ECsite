package jp.co.internous.ecsite.model.dto;

import jp.co.internous.ecsite.model.entity.User;

//ログイン情報をjavaからcontrollerへ
public class LoginDto {
	
//フィールド（渡す情報）
	
	private long id;
	
	private String userName ;
	
	private String password;
	
	private String fullName;
	
//デフォルトコンストラクタ
	public LoginDto() {}

//userエンティティから情報を受け取りセットするコンストラクタ
	public LoginDto(User user) {
		this.id=user.getId();
		this.userName=user.getUserName();
		this.password=user.getPassword();
		this.fullName=user.getFullName();
	}

//引数を受け取り情報をセットするコンストラクタ
	public LoginDto(long id,String userName,String password,String fullName) {
		this.id=id;
		this.userName=userName;
		this.password=password;
		this.fullName=fullName;
	}

	
//他クラスから使えるようにする
		
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
	


