import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author bhask
 */
public class JavaMailUtil {
    public String cCode;
    public double atd;
    
    public void sendMail(String recepient) throws MessagingException{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String hostEmail = "dummymailbms@gmail.com";
        String password = "dummy@123";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(hostEmail, password);
            }
        });
        Message message = this.prepareMessage(session , hostEmail ,recepient);
        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private Message prepareMessage(Session session , String hostEmail , String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(hostEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("STUDENT ATTENDANCE STATUS");
            message.setText(this.cCode+" : "+this.atd);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, "Email not sent", ex);
        }
        return null;
    }
}
