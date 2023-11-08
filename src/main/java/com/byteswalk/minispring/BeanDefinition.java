package com.byteswalk.minispring;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:05
 * @desc 用来定义 Bean 对象，其实现方式是以一个 Object 类型存储对象
 */
public class BeanDefinition {

    @SuppressWarnings({"all"})
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
