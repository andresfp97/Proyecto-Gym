package ModeloDAO;

import ModeloVO.ClienteVO;
import ModeloVO.LoginVO;
import java.sql.*;
import javax.swing.JTextField;
import VistaGym.Gym;

public class LoginDAO {
   public static ResultSet rs ;

    public static Boolean login (LoginVO i) {
        try {
            Connection conexion = Servicios.Conexion.getConnection();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT id, usuario, contra, tipo FROM login   WHERE usuario = ?");
            consulta.setString(1, i.getUsuario());
            rs = consulta.executeQuery();

            if (rs.next()) {

                if (i.getContra().equals(rs.getString("contra"))) {
                    
                    i.setId(rs.getString("id"));
                    i.setTipo(rs.getString("tipo"));
                    
                    return true;
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public static Boolean buscarUsuario(LoginVO i) {
        try {
            Connection conexion = Servicios.Conexion.getConnection();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT * FROM login WHERE usuario = ?");
            consulta.setString(1, i.getUsuario());
            ResultSet rs = consulta.executeQuery();
            if (rs.next()) {
                i.setId(rs.getString("id"));
                i.setUsuario(rs.getString("usuario"));
                i.setContra(rs.getString("contra"));
                i.setTipo(rs.getString("tipo"));
                return true;
            }
            return false;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return false;
    }

    public static void registrar(LoginVO i) {
        try {
            Connection conexion = Servicios.Conexion.getConnection();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO login (id, usuario, contra, tipo ) "
                    + "VALUES(?, ?, ?, ?)");
            consulta.setString(1, i.getId());
            consulta.setString(2, i.getUsuario());
            consulta.setString(3, i.getContra());
            consulta.setString(4, i.getTipo());

            consulta.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void modificarRegistro(LoginVO i) {
        try {
            Connection conexion = Servicios.Conexion.getConnection();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("UPDATE login SET  usuario=?, contra=?, tipo =? WHERE id =?");
            consulta.setString(1, i.getUsuario());
            consulta.setString(2, i.getContra());
            consulta.setString(3, i.getTipo());
            consulta.setString(4, i.getId());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public static void Eliminar(LoginVO i) {
        try {
            Connection conexion = Servicios.Conexion.getConnection();
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("DELETE FROM login WHERE usuario = ?");
            consulta.setString(1, i.getUsuario());
            consulta.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

}
