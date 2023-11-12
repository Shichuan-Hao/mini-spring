package com.byteswalk.minispring.factory;

import com.byteswalk.minispring.BeansException;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:13
 * @desc 代表 Bean 对象的工厂，可以将 Bean 对象的定义存储到 Map 中以便获取 Bean 对象
 */
public interface BeanFactory {
    Object getBean(String name)
            throws BeansException;

    Object getBean(String name, Object... args)
            throws BeansException;
}
