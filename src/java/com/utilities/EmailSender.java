/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utilities;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailSender {
    public static boolean sendEmail(String host, String port,
            final String userName, final String password, String toAddress[],
            String subject, String message) throws AddressException,
            MessagingException {
            
        boolean status=false;
        
        // sets SMTP server properties
        try{
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
       // properties.put("mail.smtp.tsl.trust","smtp.gmail.com");
       
        
// creates a new session with an authenticator
        Authenticator auth;
        auth = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses  = new InternetAddress[toAddress.length];
        for(int i=0;i<toAddress.length;i++)
        {
          toAddresses[i] =  new InternetAddress(toAddress[i].trim()) ;
         }
        
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        msg.setText(message);
 
        // sends the e-mail
        Transport.send(msg);
        status=true;
        }
    
    catch(Exception e){
    System.out.println("Email Erro:" +e.getMessage());
        }
    return status;
    }
    public static void main(String[] args) {
        System.out.println("ok");
    }
}

