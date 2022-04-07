/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import GUI.Modify1;
import OOP.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramy alaa
 */
public abstract class DB_admin extends DB_employee implements Admin{
  
public ResultSet view(String col, String t) {
        
        try {
            Statement st = c.createStatement();
            String sql = "select " + col + " from " + t + " ";
            v = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);

        }
        return v;
    }
public int delete_(String t, int id) {
        
        try {
            String sql = "delete " + t + " from  where emp_id='" + id + "'";
//            c = connect();
            Statement st = c.createStatement();
            res = st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Modify1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
 public ResultSet select(String n, String m, String col, String t, String d, String sr) {
       

        try {

            String sql = "select " + n + "," + m + " ," + col + " from " + t + " where  " + d + " = '" + sr + "'  ";
//            c = connect();
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }
 public abstract ResultSet select(String col, String t,  String d,int id) ;
 public abstract int insert(String t,String e,String h,String b,String id, String p_id, String name);
public abstract int update(String j,String e,String h, double x, int id); 
}


