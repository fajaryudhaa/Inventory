/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import tampilan.KoneksiDB;
import tampilan.Login;

/**
 *
 * @author User
 */
public class Inventory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        KoneksiDB.koneksiMySQL("inventory","root","");
        new Login().setVisible(true);
    }
    
}
