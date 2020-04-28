package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//cartエンティティ
//シリアライズするインターフェイスを実装
public class Cart implements Serializable {
private static final long SerialVersionUID = 1L;

//フィールド

private long id;

private String goodsName;

private long price;

private long count;

//他クラスから使えるようにする

//id
public long getId() {
	return id;
}
public void setId(long id) {
	this.id=id;
}

//goodaName
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

//count
public long getCount() {
	return count;
}
public void setCount(long count) {
	this.count=count;
}

}
