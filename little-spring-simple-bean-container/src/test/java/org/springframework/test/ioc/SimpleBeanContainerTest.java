package org.springframework.test.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @description: 最简单的容器测试
 * @author: ahh556
 * @createDate: 2022/7/8
 * @version: 1.0
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("HelloSpring",new HelloSpring());
        HelloSpring helloSpring = (HelloSpring) beanFactory.getBean("HelloSpring");
        assertThat(helloSpring).isNotNull();
        assertThat(helloSpring.sayHello()).isEqualTo("Hello,Spring");


    }
    class HelloSpring {

        String sayHello() {
            return "Hello,Spring";
        }

    }
}
