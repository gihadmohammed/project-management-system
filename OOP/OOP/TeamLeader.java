/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import DB.DB_employee;
import java.sql.ResultSet;

/**
 *
 * @author ramy alaa
 */

public interface TeamLeader extends Employee {

    public abstract ResultSet select(String col, String t, String d ,int id);

   // public abstract int insert(String t,String e,String h,String b,String id, String p_id, String name);

    public abstract ResultSet select(String n, String m, String col, String t, String d, String sr);

  //  public abstract int update(String j,String e,String h, int x, int id);
}
