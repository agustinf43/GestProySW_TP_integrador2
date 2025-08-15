import java.util.Scanner;
import java.util.logging.Logger;

public class ej2 {

    public static final Logger Log=
            Logger.getLogger(ej2.class.getName());

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String usuario="ISP";
        String contraseña="63";

        int intento=0;

        do {
            System.out.println("Ingrese nombre de usuario");
            String user=sc.next();

            System.out.println("Ingrese contraseña:");
            String password= sc.next();

            intento++;

            if (!usuario.equals(user) || !contraseña.equals(password) && intento!=3) {
                System.out.println("Usuario o contraseña incorrectos,intente nuevamente");
            }else if (intento==3){
                Log.warning("Ha realizado muchos intentos,su usuario a sido bloqueado");
            } else {
                Log.info("Acceso concedido");
                break;
            }

        }while(intento<3);
    }
}
