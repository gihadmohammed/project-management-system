/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.sql.ResultSet;
import java.time.LocalTime;

/**
 *
 * @author ramy alaa
 */
public interface  Employee {
//     private LocalTime  t_hours_per_month;
    public abstract ResultSet select(String col, String t, int id, String password);
     public abstract int insert(String t,String e,String h,String b,String id, String p_id, String name);
  public abstract int update(String j,String e,String h, int x, int id);
}
