package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

import java.util.List;

//カートに入力された情報を管理
//シリアライズするインターフェイスを実装

public class CartForm implements Serializable {
	
//serialVertionUID
private static final long SerialVersionUID = 1L;

//フィールド

private long userId;

private List<Cart> cartList;

//他クラスから使えるようにする

//userId
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId=userId;
	
}

//Cartクラスの情報
public List<Cart> getCartList() {
	return cartList;
}
public void setCartList(List<Cart> cartList) {
	this.cartList=cartList;
	
}

}
