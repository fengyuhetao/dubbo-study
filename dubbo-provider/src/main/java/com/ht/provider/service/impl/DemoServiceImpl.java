package com.ht.provider.service.impl;

import com.ht.api.service.DemoService;

/**
 * @author HT
 * @version V1.0
 * @package com.ht.provider.service.impl
 * @date 2019-01-15 18:16
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        System.out.println("hello:" + name);
        return "hello" + name;
    }
}
