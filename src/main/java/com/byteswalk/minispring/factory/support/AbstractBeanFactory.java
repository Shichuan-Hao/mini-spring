package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.BeansException;
import com.byteswalk.minispring.factory.BeanFactory;
import com.byteswalk.minispring.factory.config.BeanDefinition;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:23
 */
public abstract class AbstractBeanFactory
        extends DefaultSingletonBeanRegistry
        implements BeanFactory {

    public Object getBean(String name)
            throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName)
            throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args)
            throws BeansException;
}
