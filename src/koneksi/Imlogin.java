/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tampilan.KoneksiDB;

/**
 *
 * @author User
 */
public class Imlogin {

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the rsLogin
     */
    public ResultSet getRsLogin() {
        return rsLogin;
    }

    /**
     * @param rsLogin the rsLogin to set
     */
    public void setRsLogin(ResultSet rsLogin) {
        this.rsLogin = rsLogin;
    }
    public Imlogin( String user, String pass ) {
       this.user=user;
       this.pass=pass;
       
}
    public boolean doLogin() {
        boolean b = false;
        String q1 = "select * from login where username='"+user+
                    "' and password='"+pass+"'";
        rsLogin = KoneksiDB.getRS(q1);
        try {
            if (rsLogin.next()) {
                b = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Imlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    
private String user;
private String pass;
private ResultSet rsLogin;
}
