package jp.co.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.entity.Goods;

//goodsテーブルから全商品を検索できるようDBと接続するクラス
public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
