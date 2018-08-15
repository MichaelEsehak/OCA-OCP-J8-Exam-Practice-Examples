/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10;

/**
 *
 * @author Michael
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args)  throws ClassNotFoundException,SQLException{
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";

        String sql = "select * from animal";
        Class.forName("java.sql.Driver");
        try (Connection conn = DriverManager.getConnection(url, "root", "root");
                Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery(sql)) {
            //rs.next();
            //rs.absolute(0);
            while(rs.next()){
                System.out.println(rs.getString(3));
            }
            ResultSet rs2=stmt.executeQuery(sql);
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
