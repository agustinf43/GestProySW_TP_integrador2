package org.isp63_Prog1.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorDeConexion {
  public static Connection obtenerConexion(){

    //4 datos de coexion
    String dbDrivr="com.mysql.cj.jdbc.Driver";
    //cadena de conneccion de mi bd
    String bdCadenaConnexion="jdbc:mysql://127.0.0.1:3307/progautos";
    //nom usuarioBD
    String bdUsuario="root";
    //pass bd
    String bdPass="root";

    Connection conn=null;
    try {
      Class.forName(dbDrivr);
      conn= DriverManager.getConnection(bdCadenaConnexion,bdUsuario,bdPass);
    } catch (ClassNotFoundException e) {
      System.out.println("no se encontro el driver de la BD");
      throw new RuntimeException(e);
    } catch (SQLException e) {
      System.out.println("no se pudo conectar a la base de datos");
      throw new RuntimeException(e);
    }

    System.out.println("connexion exitosa a la base de datos!!!");
    return conn;
  }
}
