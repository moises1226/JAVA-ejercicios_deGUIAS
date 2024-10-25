import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             Scanner input = new Scanner(socket.getInputStream());
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) { // Modo auto-flush

            int vector[] = {6, 6, 6};

            int lg = vector.length;
            // 1.- Se envía el tamaño de los vectores al servidor.
            output.println(lg);

            for (int i = 0; i < vector.length; i++) {
                output.println(vector[i]);
            }

            // Se asegura que la información se envíe al servidor.
            output.flush();

            // 4.- Se espera por el resultado que envía el servidor.
            int sumaTotal = input.nextInt();

            // Se imprime por pantalla el resultado.
            System.out.println(String.format("La suma total del vector es: %d", sumaTotal));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
