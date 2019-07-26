package com.hti.servicetest;

import com.hti.baseTest.SpringTestCase;
import com.hti.entity.User;
import com.hti.service.UserService;

import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringTestCase {

	Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired  
    private UserService userService; 
    @Test  
    public void selectUserByIdTest(){  
    	//User user=userService.queryByNameAndPassowrd("hti01","123456");
    	List<User> userlist=userService.queryByNameAndPassowrd("hti01","123456");
    	User user=userlist.get(0);
    	//User user=userService.queryById(1);
        logger.info("查找结果" + user);  
    }  
}
