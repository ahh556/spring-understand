package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: simple-bean-container(最简单的bean容器)
 * @author: ahh556
 * @createDate: 2022/7/8
 * @version: 1.0
 */
public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name,bean);
    }
    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
