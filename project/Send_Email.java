/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Ruchi Patel
 */
public class Send_Email 
{ 
    
    public static void main(String[] args)
    {
            String message = "Hello, User You are successfully registered and this mail for confirmation";
            String subject = "Confirmation for Registration";
            String to = "pateldr056@gmail.com";
            String from = "oxygencylinderavailability@gmail.com";
            
            sendemail(message , subject , to , from);
    }
    
    static void sendemail(String message , String subject , String to , String from)
    {
        //variable for Host
        String host = "smtp.gmail.com";
        
        //Get the System Properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES = "+properties);
        
        //Setting import information to properties object
        
        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        
        //Step 1 : get the session object
        Session session = Session.getInstance(properties , new Authenticator(){
            
             protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("oxygencylinderavailability@gmail.com","Oxygen1234@"); 
            }
        
        });
        
        session.setDebug(true);

        //Step 2 : Compose the mail
        MimeMessage M = new MimeMessage(session);
        
        
        try
        {
            //From email
            M.setFrom(from);
            
            //adding recipient
            M.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            //adding subject to message
            M.setSubject(subject);
            
            //adding text to message
            M.setText(message);
            
            //Step 3 : send the message using Transport Class
            Transport.send(M);
            
            System.out.println("Message is successfully send");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
