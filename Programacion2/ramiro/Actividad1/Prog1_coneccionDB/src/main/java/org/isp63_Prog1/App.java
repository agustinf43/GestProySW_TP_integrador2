package org.isp63_Prog1;

import org.isp63_Prog1.configuracion.AdministradorDeConexion;
import org.isp63_Prog1.dad.AutoDAD;
import org.isp63_Prog1.entities.Auto;
import org.isp63_Prog1.entities.Marca;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        //Connection miConexion = AdministradorConexiones.obtenerConexion();
        Auto auto =
            new Auto("CCCCC", "Blanco", 2025, 897, Marca.HONDA, "Prius");

        AutoDAD autoDAO = new AutoDAD();
        AutoDAD.insertarAuto(auto);

        List<Auto> miLista=autoDAO.findAll();

        //Recorro la lista de autos
        if (!miLista.isEmpty()){
            for (Auto a : miLista){
                System.out.println(a.toString());
            }
        }

    }
}
