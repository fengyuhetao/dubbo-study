package com.ht;

import com.ht.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HT
 * @version V1.0
 * @package com.ht
 * @date 2019-01-15 18:35
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.sayHello("haha"));
    }
}
