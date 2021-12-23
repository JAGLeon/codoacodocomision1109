package config;

import java.sql.*;
import sun.util.logging.PlatformLogger;


public class BasedeDatos {
    public String driver="com.mysql.jdbc.Driver";
    public Connection getConection()throws SQLException, ClassNotFoundException{
        Connection conexion = null;
        try{
            Class.forName(driver);
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109",
                    "admin","admin");
        }catch(SQLException e){
           System.out.println(e.toString());
        }
        return conexion;
    }
    public static void main(String[]args) throws SQLException, ClassNotFoundException{
        BasedeDatos con = new BasedeDatos();
        Connection conexion = null;
        conexion = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        ps = conexion.prepareStatement("SELECT * FROM participantes");
        rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String nombres = rs.getString("nombres");
            String apellidos = rs.getString("apellidos");
            String email = rs.getString("email");
            String telefono = rs.getString("telefono");
            System.out.println("id: " + id +" Nombres: "+ nombres + " Apellidos: "
                    +apellidos + " Email: " + email + " telefono: "+telefono);
        }
        
    }
}
