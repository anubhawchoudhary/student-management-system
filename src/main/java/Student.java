
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Student {
    
    public int AddStudentToCourse(String cc ,String cn , int credit , int sem , int m , float atd , String usn , String tid , String yr ){
        
        Connection con = MyConnection.getConnection();
        PreparedStatement ps;
        
        try {
            ps=con.prepareStatement("INSERT INTO teaches values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1, cc);
            ps.setString(2, cn);
            ps.setInt(3, credit);
            ps.setInt(4, sem);
            ps.setInt(5, m);
            ps.setFloat(6, atd);
            ps.setString(7, usn);
            ps.setString(8, tid);
            ps.setString(9, yr);
            
            int res = ps.executeUpdate();
            return res;
            
        } catch (SQLException ex) {
            return -1;
        }

        
    }
    
}
