package com.itheima.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    public RedisTemplate redisTemplate;

    @Autowired
    public StringRedisTemplate redisTemplateString;

    @Test
    void testSet() {
        redisTemplate.boundValueOps("name").set("haoxiaoyu");
    }

    @Test
    void testGet() {
        Object name = redisTemplate.boundValueOps("name").get();
        System.out.println(name);
    }


    @Test
    void testSet1() {
        redisTemplateString.opsForValue().set("name", "haolizhou");
    }

}
