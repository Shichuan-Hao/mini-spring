package com.byteswalk.minispring.factory.config;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:05
 * @desc 用来定义 Bean 对象，其实现方式是以一个 Object 类型存储对象
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
