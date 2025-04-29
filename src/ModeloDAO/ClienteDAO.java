package ModeloDAO;

import ModeloVO.ClienteVO;
import java.sql.*;
import javax.swing.JTextField; 
import VistaGym.Gym;


public class ClienteDAO {
   static Gym g = new Gym();
   public static ResultSet rs;
   
   public static void registrar(ClienteVO i){
      try{
         Connection conexion = Servicios.Conexion.getConnection();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO cliente (nombre, cedula, celular, fecha, fechafin) "
                 + "VALUES(?, ?, ?, ?, ?)");        
         consulta.setString(1, i.getNombre());
         consulta.setString(2, i.getCedula());
         consulta.setString(3, i.getCelular());
         consulta.setString(4, i.getFecha());
         consulta.setString(5, i.getFechafin());
         
         consulta.executeUpdate();
      }catch(SQLException ex){
           System.out.println(ex); 
      } 
    }

public static Boolean existeCedula(ClienteVO i){
      try{
         Connection conexion = Servicios.Conexion.getConnection();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("SELECT * FROM cliente WHERE cedula = ?");        
         consulta.setString(1, i.getCedula());
         ResultSet rs = consulta.executeQuery();
         if(rs.next()){
             i.setNombre(rs.getString("nombre"));
             i.setCedula(rs.getString("cedula"));
             i.setCelular(rs.getString("celular"));
             i.setFecha(rs.getString("fecha"));
             i.setFechafin(rs.getString("fechafin"));
             i.setId(rs.getString("id"));
             return true;
         }
          
         return false;
      }catch(SQLException ex){
           System.out.println(ex); 
      }
        return false;
    }

 public static void modificar (ClienteVO i){
      try{
         Connection conexion = Servicios.Conexion.getConnection();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("UPDATE cliente SET  nombre=?, cedula=?, celular=?, fecha=?, fechafin=? WHERE id =?");        
         consulta.setString(1, i.getNombre());
         consulta.setString(2, i.getCedula());
         consulta.setString(3, i.getCelular());
         consulta.setString(4, i.getFecha());
         consulta.setString(5, i.getFechafin());
         consulta.setString(6, i.getId());
         
         consulta.executeUpdate();
         
                 
      }catch(SQLException ex){
          System.out.println(ex);  
      }  
 }
 
   public static void Eliminar(ClienteVO i){
      try{
         Connection conexion = Servicios.Conexion.getConnection();
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("DELETE FROM cliente WHERE cedula = ?");
         consulta.setString(1, i.getCedula());
         consulta.executeUpdate();
         
      }catch(SQLException ex){
          System.out.println(ex);   
      } 
      
    }
   
}
