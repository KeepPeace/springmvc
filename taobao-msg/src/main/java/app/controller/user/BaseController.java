package app.controller.user;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public abstract class BaseController {

	@ExceptionHandler
    public String exception(HttpServletRequest request, Exception e) {  
		//添加自己的异常处理逻辑，如日志记录　　　
		request.setAttribute("exceptionMessage", e.getMessage());  
        // 根据不同的异常类型进行不同处理
        if(e instanceof SQLException) 
            return "testerror";   
        else
            return "error";  
    }
}
