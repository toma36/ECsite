package jp.co.internous.ecsite.model.form;


import java.io.Serializable;

//入力されたlogin情報を完了するクラス
//シリアライズするインターフェイスを実装

public class LoginForm implements Serializable{
	
//serialVersionUIDを設定
	private static final long serialVersionUID = 1L;

	
//フィールド（送る情報）
	private String userName;
	
	private String password;
	
	
//他クラスから使えるようにする
	//userName
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName= userName;
	}
	
	//password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password= password;
	}
}
