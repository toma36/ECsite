package jp.co.internous.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.entity.Goods;

//goods�e�[�u������S���i�������ł���悤DB�Ɛڑ�����N���X
public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
