package app.controller.user;

import app.dao.domain.User;
import app.model.UserModel;
import app.service.user.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * &#x57fa;&#x4e8e;SpringMvc&#x7684;web&#x5c55;&#x793a;
 * @author kevin.wang
 *
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@Autowired
	private UserServiceI userService;

	@RequestMapping(value="/toRegist")
	public String toRegist(Model model){
		UserModel user = new UserModel();
		model.addAttribute("user",user);
		return "user/regist";
	}
	
	
	@RequestMapping(value="/regist")
	public String regist(Model model,UserModel user){
		User user1 = new User();
		user1.setId(1);
		user1.setName("王大侠");
		user1.setAge(12);
		userService.addUser(user1);
		model.addAttribute("user",user);
		return "user/regist";
	}
	
	
}
