package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

import java.util.List;

//�J�[�g�ɓ��͂��ꂽ�����Ǘ�
//�V���A���C�Y����C���^�[�t�F�C�X������

public class CartForm implements Serializable {
	
//serialVertionUID
private static final long SerialVersionUID = 1L;

//�t�B�[���h

private long userId;

private List<Cart> cartList;

//���N���X����g����悤�ɂ���

//userId
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId=userId;
	
}

//Cart�N���X�̏��
public List<Cart> getCartList() {
	return cartList;
}
public void setCartList(List<Cart> cartList) {
	this.cartList=cartList;
	
}

}
