package util;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

/**
 * WebContextUtil
 *
 * @author Wang yong
 * @date 2016/1/14
 */
public class WebContextUtil {

    private static WebApplicationContext wac;

    public static WebApplicationContext getContext(){
        if(null == wac){
            wac = ContextLoader.getCurrentWebApplicationContext();
        }
        return wac;
    }

}
