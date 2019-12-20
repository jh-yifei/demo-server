package com.yifei.demo;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import com.yifei.demo.dao.AaaMapper;
import com.yifei.demo.domain.Aaa;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoServerApplicationTests {
    @Resource
    private AaaMapper aaaMapper;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate; //专门操作字符串的
    @Resource
    private JavaMailSenderImpl javaMailSender; //邮件发送器

    @Test
    void contextLoads() {
    }

    /**
     * String(字符串)，List（列表）,Set（集合）,Hash（序列）,ZSet(有序集合)
     */
    @Test
    public void myStringRedis() {
//        stringRedisTemplate.opsForValue().append("msg"," world");
        String msg = stringRedisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }

    // 简单邮件发送模版
    @Test
    public void mySimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("恰饭主题");
        message.setText("听说今年这个主题恰饭很不错，千万不要错过。");
        message.setTo("15656026415@163.com");
        message.setFrom("3054097744@qq.com");
        javaMailSender.send(message);
    }

    // 复杂邮件发送模版
    @Test
    public void myEmail() throws Exception {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setSubject("恰饭主题");
        helper.setText("<b style='color:red'>听说今年这个主题恰饭很不错，千万不要错过。</b>", true);
        helper.setTo("15656026415@163.com");
        helper.setFrom("3054097744@qq.com");

        // 添加附件
        helper.addAttachment("骆玉珠1.jpg", new File("F:\\Source\\Image\\骆玉珠1.jpg"));
        helper.addAttachment("骆玉珠2.jpg", new File("F:\\Source\\Image\\骆玉珠2.jpg"));
        javaMailSender.send(message);
    }

}
