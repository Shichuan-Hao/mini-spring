package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.factory.config.BeanDefinition;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:46
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     * @param beanName the name of bean
     * @param beanDefinition the definition of bean
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
