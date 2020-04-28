package jp.co.internous.ecsite.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//goods�e�[�u���ɃA�N�Z�X����N���X
@Entity
@Table(name="goods")
public class Goods {
	
//�t�B�[���h�i�e�[�u���̃J�����j
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="price")
	private long price;
	
	@Column(name="update_at")
	private Timestamp updateAt;
	
	
//���N���X����g����悤�ɂ���
	
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
	
	//updateAt
	public Timestamp getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt=updateAt;
	}

}
