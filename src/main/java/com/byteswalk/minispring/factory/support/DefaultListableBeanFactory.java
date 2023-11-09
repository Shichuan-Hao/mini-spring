package com.byteswalk.minispring.factory.support;

import com.byteswalk.minispring.BeanException;
import com.byteswalk.minispring.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:44
 */
    public class DefaultListableBeanFactory
        extends AbstractAutowireCapableBeanFactory
        implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName)
            throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeanException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}
