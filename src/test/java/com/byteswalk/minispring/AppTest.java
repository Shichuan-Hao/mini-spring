package com.byteswalk.minispring;

import com.byteswalk.minispring.bean.UserService;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test_BeanFactory() {
        // 1. 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfos();
    }
}
