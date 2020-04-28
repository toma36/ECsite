package jp.co.internous.ecsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.ecsite.model.dao.GoodsRepository;
import jp.co.internous.ecsite.model.dao.UserRepository;
import jp.co.internous.ecsite.model.entity.Goods;
import jp.co.internous.ecsite.model.entity.User;
import jp.co.internous.ecsite.model.form.GoodsForm;
import jp.co.internous.ecsite.model.form.LoginForm;

//�Ǘ��҃T�C�g��controller
@Controller
//�g�b�v�T�C�gURL�w��
@RequestMapping("/ecsite/admin")
public class AdminController {
	
	//�C���X�^���X��
	@Autowired
	private UserRepository userRepos;
	@Autowired
	private GoodsRepository goodsRepos;
	
	//adminindex.html�ɑJ�ڂ��郁�\�b�h
	@RequestMapping("/")
	public String index() {
		return "adminindex";
	}
	
	/*login����welcome.html�Ƀ}�b�s���O�ADB�Ɖ��
	 ���݂��Ă�����Ǘ��҂��ǂ������擾
	 �Ǘ��҂Ȃ�view�ɒl��n�����\�b�h
	 */
	@PostMapping("/welcome")
	public String welcome(LoginForm form,Model m) {
		List<User> users=userRepos.findByUserNameAndPassword(form.getUserName(),form.getPassword());
		if (users !=null && users.size()>0){
			boolean isAdmin =users.get(0).getIsAdmin() !=0;
			if(isAdmin) {
				List<Goods> goods =goodsRepos.findAll();
				m.addAttribute("userName", users.get(0).getUserName());
				m.addAttribute("password", users.get(0).getPassword());
				m.addAttribute("goods",goods );	
			}
		}
		return "welcome";
	}
	
	//���O�C�����������ĐV�K�o�^�y�[�W�ɑJ�ڂ��郁�\�b�h
	@RequestMapping("/goodsMst")
	public String goodsMst(LoginForm form,Model m) {
		m.addAttribute("userName", form.getUserName());
		m.addAttribute("password", form.getPassword());
		return "goodsmst";
	}
	
	//�V�K�o�^�œ��͂��������Z�b�g�����O�C������������welcome.html�ɑJ�ڂ��郁�\�b�h
	@RequestMapping("/addGoods")
	public String addGoods(GoodsForm goodsForm,LoginForm loginForm,Model m) {
		m.addAttribute("userName", loginForm.getUserName());
		m.addAttribute("password", loginForm.getPassword());
		Goods goods =new Goods();
		goods.setGoodsName(goodsForm.getGoodsName());
		goods.setPrice(goodsForm.getPrice());
		goodsRepos.saveAndFlush(goods);
		
		return "forward:/ecsite/admin/welcome";
	}
	
	//���i���������郁�\�b�h
	@ResponseBody
	@PostMapping("/api/deleteGoods")
	public String deleteApi(@RequestBody GoodsForm f, Model m) {
		try {
			goodsRepos.deleteById(f.getId());
		} catch (IllegalArgumentException e) {
			return "-1";
		}
		return "1";
	}

	}
