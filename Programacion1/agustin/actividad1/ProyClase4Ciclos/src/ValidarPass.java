import java.util.Scanner;

public class ValidarPass {

    public static void main(String[] args) {

        String pass;
        String user;
        Scanner dato=new Scanner(System.in);

        boolean siAcerto=false;

        for(int i=0; i<3 ;i++)
        {
            System.out.println("Por favor ingrese el usuario");
            user= dato.next();
            System.out.println("Por favor ingrese la contraseña");
            pass= dato.next();
            if(user.equals("ADMIN") && pass.equals("1234")){
                System.out.println("Puede ingresar");
                siAcerto=true;
                break;
            }

        }
        if(siAcerto==false){
            System.out.println("Numero de intentos excedidos se bloqueo el usuario");
        }

    }// cierra main
}
