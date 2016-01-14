package app.controller.restful;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.dao.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 基于SpringMvc的Restful风格接口
 * @author kevin.wang
 *
 */
@RestController//等价于@Controller + @ResponseBody
@RequestMapping("/rest")
public class RestfulController {

	@RequestMapping(value="/test1/{param1}", method=RequestMethod.GET, headers={"version=1"})
	public User test1(@RequestParam(value = "name", required = false, defaultValue = "") String name,
					  @PathVariable String param1, HttpServletRequest request, HttpServletResponse response) {
			User u = new User();
			u.setName("王");
			u.setAge(11);
			u.setRegistTime(new Date());
			u.setId(1);
		return u;
	}
	
	
	
	
	
	@RequestMapping(value="/test2/{param1}", method=RequestMethod.GET)
	public String test2(@RequestParam(value = "name", required = false, defaultValue = "") String name,
			@PathVariable String param1,HttpServletRequest request,HttpServletResponse response) {
		return "王";
	}

}
