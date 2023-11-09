package com.byteswalk.minispring.factory.config;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:18
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
