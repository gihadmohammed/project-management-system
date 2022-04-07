///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package OOP;

import DB.db;

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
public interface Admin extends Employee{

    public abstract ResultSet select(String col, String t, int id, String password);

    public abstract ResultSet view(String col, String t);

    public abstract int delete_(String t, int id);
}
