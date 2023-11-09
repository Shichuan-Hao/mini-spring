package com.byteswalk.minispring.factory.config;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:05
 * @desc 用来定义 Bean 对象，其实现方式是以一个 Object 类型存储对象
 */
public class BeanDefinition {

    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }
}
