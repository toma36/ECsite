package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

//���͂��ꂽ�V�K���i�̏��Ǘ�
//�V���A���C�Y����C���^�[�t�F�C�X������
public class GoodsForm implements Serializable {
	
//serialVersionUID��ݒ�
	
	private static final long serialVersionUID = 1L;

//�t�B�[���h�i������j 
	
	private long id;
	
	private String goodsName;
	
	private long price;
	

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



}
