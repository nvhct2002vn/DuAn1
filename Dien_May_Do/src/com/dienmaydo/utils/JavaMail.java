package com.dienmaydo.utils;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

    public static void sendMail(String nguoiNhan, String tieuDe, String noiDung) throws Exception {
        final String myAcountEmail = "dienmaydo02@gmail.com";
        final String password = "vinhtq2002";
        
        Properties properties = new Properties();

        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAcountEmail, password);
            }

        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAcountEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(tieuDe));
            message.setSubject(tieuDe);
            message.setText(noiDung);
            Transport.send(message);
            System.out.println("Đã gửi mail thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
