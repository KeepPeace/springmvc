package util;

import org.apache.log4j.Logger;

/**
 * Log
 *
 * @author Wang yong
 * @date 2016/1/14
 */
public class LogUtil {
    static final Logger logger = Logger.getLogger(LogUtil.class);

    public static void info(Object message){
        logger.info(message);
    }

    public static void error(Object message){
        logger.error(message);
    }
}
