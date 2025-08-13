import java.util.Scanner;

public class Prog7_2 {
    public static void main(String[] args) {

        String usuario = "usuario";
        String contraseña = "contraseña";
        int intentos = 3;
        Scanner dato = new Scanner(System.in);

        for (int i = 0; i < intentos; i++) {

                System.out.println("Ingrese el usuario");
                usuario = dato.next();

                System.out.println("Ingrese la contraseña");
                contraseña = dato.next();

                if (usuario.equals("usuario") && contraseña.equals("contraseña")) {
                    System.out.println("Bienvenido");
                    break;
                }
                 if(!contraseña.equals("contraseña") ) {
                        System.out.println("La contraseña ingresada es incorrecta ");
                    }
                     if (!usuario.equals("usuario")){
                        System.out.println("Nombre de usuario incorrecto");
                    }
                if (intentos==0){
                System.out.println("usuario bloqueado");
                }

                }


            }


        }




