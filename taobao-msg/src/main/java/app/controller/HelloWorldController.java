package app.controller;

import app.model.TagsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping(value="/test1", method = {RequestMethod.POST,RequestMethod.GET})
	public String hello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model,HttpServletRequest request) {
		String param = request.getParameter("name");
		System.out.println(param);
		
		model.addAttribute("name", name);
		return "helloworld";
	}


	@RequestMapping(value="/tag1", method = {RequestMethod.GET})
	public String tagTest1(Model model) {
		if(!model.containsAttribute("contentModel")){        
            TagsModel tagsModel=new TagsModel();
            
            tagsModel.setUsername("王");
            tagsModel.setPassword("passwd");
            tagsModel.setTestBoolean(true);
            tagsModel.setTestArray(new String[] {"arrayItem 路人甲","arrayItem 路人丁"});
            Map<Integer,String> map=new HashMap<Integer,String>();
            map.put(1, "mapItem 1");
            map.put(2, "mapItem 2");
            map.put(3, "mapItem 3");
            tagsModel.setTestMap(map);
            tagsModel.setSelectArray(new String[] {"arrayItem 路人甲"});
            tagsModel.setRadiobuttonId(1);
            tagsModel.setSelectId(2);
            tagsModel.setSelectIds(Arrays.asList(1,2));
            tagsModel.setRemark("备注...");
            
            model.addAttribute("contentModel", tagsModel);
        }
        return "tagsTest";
	}
	
	
	/** 
     *  
     * 直接在参数的列表上定义PrintWriter，out.write(result); 
     * 把结果写到页面，建议使用的  
     *  
     */  
    @RequestMapping("/ajax")  
    public void ajax(String name, PrintWriter out) {  
        String result = "hello " + name;  
        out.write(result);  
    }  
    
    
    /** 
     *  
     * controller之间的重定向：必须要指定好controller的命名空间再指定requestMapping的值， 
     * redirect：后必须要加/,是从根目录开始 
     */  
    @RequestMapping("/redirectToForm")  
    public String redirectToForm1() {  
        return "redirect:/test1/toForm";  
    }  
}
