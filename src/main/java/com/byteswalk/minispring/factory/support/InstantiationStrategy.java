package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.BeansException;
import com.byteswalk.minispring.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author hao shichuan
 * @date 2023/11/12 13:20
 */
public interface InstantiationStrategy {

    Object instantiate(
            BeanDefinition beanDefinition,
            String beanName,
            Constructor ctor,
            Object[] args) throws BeansException;

}
