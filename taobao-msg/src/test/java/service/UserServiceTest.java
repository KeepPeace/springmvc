package service;

import app.dao.domain.User;
import app.service.user.UserServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;



 
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//如果是true不会改变数据库数据，如果是false会改变数据
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)
public class UserServiceTest {
     
    @Autowired
    private UserServiceI userService;
     
    @Test
    public void TestIndex(){
    	User user = userService.getUserById(1);
    	System.out.println(user.getName());
    }
 
}
