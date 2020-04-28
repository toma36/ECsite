package jp.co.internous.ecsite.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//goodsテーブルにアクセスするクラス
@Entity
@Table(name="purchase")
public class Purchase {
	
//フィールド（テーブルのカラム）
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@Column(name="user_id")
	private long userId;
	
	@Column(name="goods_id")
	private long goodsId;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="item_count")
	private long itemCount;
	
	@Column(name="total")
	private long total;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	
//他クラスから使えるようにする
	//id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	
	//userId
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId=userId;
	}
	
	//goodsId
	public long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(long goodsId) {
		this.goodsId=goodsId;
	}
	
	//goodsName
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName=goodsName;
	}
	
	//itemCount
	public Long getItemCount() {
		return itemCount;
	}
	public void setItenCount(long itemCount) {
		this.itemCount=itemCount;
	}
	
	//total
	public Long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total=total;
	}
	
	//createdAt
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt=createdAt;
	}
	

}
