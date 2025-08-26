package org.isp63_Prog1.dad;

import org.isp63_Prog1.configuracion.AdministradorDeConexion;
import org.isp63_Prog1.entities.Auto;
import org.isp63_Prog1.entities.Marca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AutoDAD {
  public static Connection conn;

  public static void insertarAuto(Auto auto) throws SQLException {
    conn =AdministradorDeConexion.obtenerConexion();

    String sql="INSERT INTO autos (idAuto,patente,color,anio,kilometraje,marca,modelo) " +
        "VALUES (" + auto.getIdAuto() + "," +
        "'" + auto.getPatente() + "'," +
        "'" + auto.getColor() + "'," +
        + auto.getAnio()+ "," +
        + auto.getKilometraje() + "," +
        "'" + auto.getMarca() + "'," +
        "'" + auto.getModelo() + "')" ;
    //paso 3 crear instruccion
    Statement st=null;
        try {
          st= conn.createStatement();
          st.execute(sql);
              st.close();
          conn.close();
        }catch (SQLException e){
          throw new RuntimeException(e);
        }

    //establecer conexion a la base de datos

  }
  public List<Auto> findAll(){

    //1-conectar
    conn = AdministradorDeConexion.obtenerConexion();

    //2-Crear consulta SQL
    String sql = "SELECT * FROM autos order by patente";

    //3-Crear statment
    Statement st = null;
    ResultSet rs = null;

    List<Auto> listaAutos = new java.util.ArrayList<>();

    try {
      //crear instruccion
      st = conn.createStatement();


      //4-Ejecutar consulta y guarda el resultado en resultset
      rs = st.executeQuery(sql);


      //5-recorrer el resultset y guarda los autos en una lista
      while (rs.next()){
        Auto auto = new Auto();
        auto.setIdAuto(rs.getInt("idAuto"));
        auto.setAnio(rs.getInt("anio"));
        auto.setPatente(rs.getString("patente"));
        auto.setColor(rs.getString("color"));
        auto.setKilometraje(rs.getInt("kilometraje"));
        auto.setMarca(Marca.valueOf(rs.getString("marca").toUpperCase()));
        auto.setModelo(rs.getString("modelo"));

        listaAutos.add(auto);
      }

      //cerrar el resultset y el statement
      st.close();
      rs.close();
      conn.close();



    } catch (SQLException e) {
      System.out.println("Error al crear el statement");
      throw new RuntimeException(e);
    }


    return listaAutos;
  }
}
