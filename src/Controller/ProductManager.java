package Controller;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maga
 */
public class ProductManager {

    DataAccess da = new DataAccess(); 

    public ArrayList<Product> getProducts() {
        da.openConnection();
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Statement stmt = da.getConn().createStatement();
            ResultSet query = stmt.executeQuery("select * from Productos");
            while (query.next()) {
                Product p = new Product();
                p.setProductId(query.getInt("idProducto"));
                p.setProductName(query.getString("nombreProducto"));
                p.setPrice(query.getFloat("precio"));
                productList.add(p);
            }
            query.close();
            stmt.close();
            da.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productList;
    }

}
