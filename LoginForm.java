package jp.co.internous.ecsite.model.form;


import java.io.Serializable;

//���͂��ꂽlogin������������N���X
//�V���A���C�Y����C���^�[�t�F�C�X������

public class LoginForm implements Serializable{
	
//serialVersionUID��ݒ�
	private static final long serialVersionUID = 1L;

	
//�t�B�[���h�i������j
	private String userName;
	
	private String password;
	
	
//���N���X����g����悤�ɂ���
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
