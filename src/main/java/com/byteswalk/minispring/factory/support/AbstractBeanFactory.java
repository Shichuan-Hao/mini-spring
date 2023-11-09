package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.BeanException;
import com.byteswalk.minispring.BeanFactory;
import com.byteswalk.minispring.factory.config.BeanDefinition;
import com.byteswalk.minispring.factory.config.DefaultSingletonBeanRegistry;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:23
 */
public abstract class AbstractBeanFactory
        extends DefaultSingletonBeanRegistry
        implements BeanFactory {

    public Object getBean(String beanName)
            throws BeanException {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName)
            throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition)
            throws BeanException;
}
