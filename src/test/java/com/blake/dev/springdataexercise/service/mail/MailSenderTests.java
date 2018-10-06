package com.blake.dev.springdataexercise.service.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * Created by Blake on 2018/10/5
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailSenderTests {

    @Autowired
    private JavaMailSender mailSender;

    /**
     * 简单邮件发送 helper
     */
    @Test
    public void simpleMsgSenderTest() {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("QQ邮箱发至网易邮箱测试");
        simpleMailMessage.setText("测试SpringBoot MailSender simpleMailMessage");
        simpleMailMessage.setFrom("1466225971@qq.com");
        simpleMailMessage.setTo("wubo2560@163.com");

        mailSender.send(simpleMailMessage);
    }


    /**
     * mime复杂邮件发送 mimeMailMessage 可渲染HTML页面以及携带附件
     */
    @Test
    public void mimeMsgSenderTest() throws MessagingException {

        MimeMessage mimeMessage = mailSender.createMimeMessage();

//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage); // 无需上传附件

        // 开启权限：允许上传附件
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("QQ邮箱发至网易邮箱测试  Mime");
//        helper.setText("<b style='color:red'>测试SpringBoot MailSender helper & MimeMessage</b>"); // html渲染不生效

        // html渲染生效
        helper.setText("<b style='color:red'>测试SpringBoot MailSender helper & MimeMessage</b>", true);
        helper.setFrom("1466225971@qq.com");
        helper.setTo("wubo2560@163.com");

        // 上传附件(1个或者多个)
        helper.addAttachment("1.png", new File("/Users/bw-pc/Downloads/Jietu20180705-083802.png"));

        mailSender.send(mimeMessage);
    }

}
