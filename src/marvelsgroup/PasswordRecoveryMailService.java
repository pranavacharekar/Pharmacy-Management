/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marvelsgroup;

import java.io.File;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;
import javax.activation.*;


public class PasswordRecoveryMailService{
    
    private static final String password = "pranavviit1902";
    private static final String from = "pranav.acharekar@viit.ac.in";
    private static final String sub = "Your Login Details";
        
    
    public static void sendRecoveryMail(String receiverEmail, String username, String Password, String TimeOfRequest){
        
        String bodyOfMail = "Dear "+username+",\n\nYour login credentials are :\n\nUser Name : "+username+"\nPassword :"+Password;
        String tor="\n\n\n\nService request time : "+TimeOfRequest+"\n\nRegards, \n\nTeam Marvels\n";
        bodyOfMail+=tor;
      //Get properties object    
        Properties props = new Properties();    
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.socketFactory.port", "465");    
        props.put("mail.smtp.socketFactory.class",    
                  "javax.net.ssl.SSLSocketFactory");    
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.port", "465");
        //get Session   
        Session session = Session.getDefaultInstance(props,    
          new javax.mail.Authenticator() {    
          protected PasswordAuthentication getPasswordAuthentication() {    
          return new PasswordAuthentication(from,password);  
          }
        });    
        
      //compose message    
        try {    
         MimeMessage message = new MimeMessage(session);
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmail));    
         message.setSubject(sub);    
         message.setText(bodyOfMail);    
         Transport.send(message);    
         System.out.println("Mail sent successfully");    
        } catch (MessagingException e) {throw new RuntimeException(e);}    

    }  
 
}   
