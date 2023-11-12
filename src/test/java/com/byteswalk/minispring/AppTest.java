package com.byteswalk.minispring;

import com.byteswalk.minispring.bean.UserService;
import com.byteswalk.minispring.factory.config.BeanDefinition;
import com.byteswalk.minispring.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test_BeanFactory_1() {
        // 1. 初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();

        // 2. 注册 Bean 对象
//        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
//        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
//        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean 对象
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.queryUserInfos();
    }

    @Test
    public void test_newInstance() {
        // 1. 初始化 BeanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfos();

        // 4. 第二次获取 bean from queryUserInfo
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfos();

        System.out.println(userService);
        System.out.println(userService_singleton);
        System.out.println(userService.hashCode());
        System.out.println(userService_singleton.hashCode());
        System.out.println(userService.equals(userService_singleton));
    }

    @Test
    public void test_BeanFactory() {
        // 1. 初始化 BeanFactory 接口
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注册 Bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3. 获取 Bean 对象
        UserService userService = (UserService) beanFactory.getBean("userService", "川哥");
        userService.queryUserInfos();
    }
}
