package jp.co.internous.ecsite.model.dto;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.entity.Purchase;
//�w�������̏��
public class HistoryDto {
//�t�B�[���h�i�n�����j
	private long id;
	
	private long userId;
	
	private long goodsId;
	
	private String goodsName;
	
	private long itemCount;
	
	private long total;
	
	private String createdAt;

	
//�f�t�H���g�R���X�g���N�^
	public HistoryDto() {
		
	}
//�w�������R���X�g���N�^
	public HistoryDto(Purchase entity) {
		this.id=entity.getId();
		this.userId=entity.getUserId();
		this.goodsId=entity.getGoodsId();
		this.goodsName=entity.getGoodsName();
		this.itemCount=entity.getItemCount();
		this.total=entity.getTotal();
		
		Timestamp d =entity.getCreatedAt();
		SimpleDateFormat f =new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		this.createdAt=f.format(d);
		
	}

//���N���X����g����悤�ɂ���
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
	public long getItemCount() {
		return itemCount;
	}
	public void setItemCount(long itemCount) {
		this.itemCount=itemCount;
	}
	//total
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total=total;
	}
	//createdAt
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt=createdAt;
	}
	
	
}
