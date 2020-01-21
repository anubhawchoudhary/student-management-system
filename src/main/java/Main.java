
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;


public class Main {
    public static void main(String[] args) {
        try {
            JavaMailUtil s = new JavaMailUtil();
            s.cCode="DBMS";
            s.atd=76.4;
            String ma="anubhaw.is17@bmsce.ac.in";
            s.sendMail(ma);
            System.out.println("message sent");
        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
