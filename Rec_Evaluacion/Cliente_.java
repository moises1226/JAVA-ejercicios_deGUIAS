import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente_ {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {

            System.out.print("Ingrese su nombre de Usuario ");
            String nombre = in.nextLine();
            System.out.print("Ingrese el genero de pelicula ");
            String genero = in.nextLine();

            try(Socket socket = new Socket("localhost", 12345);

                Scanner input = new Scanner(socket.getInputStream());
                PrintWriter output = new PrintWriter(socket.getOutputStream())) {

                // Enviar la cadena de texto al servidor
                output.println(nombre);
                output.println(genero);

                //Se asegura que la información se envíe al servidor.
                output.flush();

                String[]  peliculas = new String[5];
                for (int i = 0; i < peliculas.length; i++) {
                    peliculas[i] = input.nextLine();
                }


                System.out.println("Las peliculas del genero que eligio son:\n");
                for(String p : peliculas){
                    System.out.println(p);
                }


                System.out.print("\n ¿Que pelicula quiere ver?\n");


                String peliSeleccionada = in.nextLine();
                output.println(peliSeleccionada);
                output.flush();

                String respuesta = input.nextLine();

                System.out.println(respuesta);



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}