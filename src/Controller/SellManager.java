package Controller;

import Model.Sell;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maga
 */

//VERIFICAR CLASE DE CONEXIÓN QUE ANDA PARA EL CULO
public class SellManager {

    DataAccess da = new DataAccess();

    public void addSell(Sell s) {
        try {
            PreparedStatement stmt = da.getConn().prepareStatement("insert into Ventas values (?, ?, ?, ?)");
            stmt.setInt(1, s.getProduct());
            stmt.setInt(2, s.getAmount());
            stmt.setBoolean(3, s.isAppliesDiscount());
            stmt.setInt(4, s.getDiscount());
            stmt.executeUpdate();
            stmt.close();
            da.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SellManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
