package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.BeanException;
import com.byteswalk.minispring.factory.config.BeanDefinition;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:36
 */
public abstract class AbstractAutowireCapableBeanFactory
        extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition)
            throws BeanException {
        Object bean = null;
        try {
            bean = beanDefinition.getBean().getConstructor().newInstance();
        } catch (Exception e) {
            throw new BeanException("Instantiation of been failed", e);
        }

        registerSingleton(beanName, bean);
        return bean;
    }
}
