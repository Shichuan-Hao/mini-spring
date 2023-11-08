package com.byteswalk.minispring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:13
 * @desc 代表 Bean 对象的工厂，可以将 Bean 对象的定义存储到 Map 中以便获取 Bean 对象
 */
public class BeanFactory {

    @SuppressWarnings({"all"})
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public  Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public  void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
