/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuiskipasangin.db;

/**
 *
 * @author YENI
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kuiskipasangin.model.kipas;
import kuiskipasangin.model.kipas;


public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }

    public void addkipas(kipas k){
        String insertTv = "INSERT INTO `kipasangin`(`kode`, `merk`, `harga`, `tgl_beli`)"
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertTv);
            stmtInsert.setString(1, k.getKode());
            stmtInsert.setString(2, k.getMerk());
            stmtInsert.setString(3, k.getTgl_beli());
            stmtInsert.setString(4, k.getHarga());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addKipas(kipas k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

