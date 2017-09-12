package com.loveluckystar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by bjlixing on 2017/9/12.
 */

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@RequestParam int a,@RequestParam int b) {
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a="+a+"&b="+b, String.class).getBody();
    }
}
