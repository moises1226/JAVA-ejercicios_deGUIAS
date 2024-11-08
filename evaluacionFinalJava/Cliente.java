import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            System.out.print("Ingrese un monto y depues el tipo de moneda de ese monto ");
            int monto = in.nextInt();
            String tipo = in.nextLine();

            if(!tipo.equals("P") || !tipo.equals("R") || !tipo.equals("D") ||  !tipo.equals("S") || !tipo.equals("E")){
                System.out.println("El tipo de cambio que a selecionado no existe");
                return;
            }

            System.out.println("A que moneda desea convertir el monto");
            String conversion = in.nextLine();
            if(!conversion.equals("P") || !conversion.equals("R") || !conversion.equals("D") ||  !conversion.equals("S") || !conversion.equals("E")){
                System.out.println("El tipo de cambio que a selecionado no existe");
                return;
            }

            try(Socket socket = new Socket("localhost", 12345);
                //recibir
                Scanner input = new Scanner(socket.getInputStream());
               //enviar
                PrintWriter output = new PrintWriter(socket.getOutputStream())) {

                // 1.- Se envía el tamaño de los vectores al servidor.
                output.println(monto);
                output.println(tipo);
                output.println(conversion);


                // Se asegura que la información se envíe al servidor.
                output.flush();

                // 4.- Se espera por el resultado que envía el servidor.
                String TextoReverso = input.nextLine();

                // Se imprime por pantalla el resultado.
                System.out.println(String.format("El reverso es" + TextoReverso));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}