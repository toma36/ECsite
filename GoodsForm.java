package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//入力された新規商品の情報管理
//シリアライズするインターフェイスを実装
public class GoodsForm implements Serializable {
	
//serialVersionUIDを設定
	
	private static final long serialVersionUID = 1L;

//フィールド（送る情報） 
	
	private long id;
	
	private String goodsName;
	
	private long price;
	

//他クラスから使えるようにする
	
	//id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	
	//goodsName
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName=goodsName;
	}
	
	//price
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price=price;
	}



}
