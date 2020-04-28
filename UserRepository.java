package jp.co.internous.ecsite.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.entity.User;

//loginForm‚©‚çó‚¯‚Á‚Æ‚Á‚½î•ñ‚ğDB‚ÅÆ‡‚·‚éƒNƒ‰ƒX
public interface UserRepository extends JpaRepository<User,Long> {
	
	List<User> findByUserNameAndPassword(String userName,String password);

}
