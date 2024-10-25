import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ManejadorCliente extends Thread {
    private Socket socket;

    public ManejadorCliente(Socket socket) {
        this.socket = socket;
    }

    public void handle() {
        this.start();
    }

    public void run() {
        try (Scanner in = new Scanner(socket.getInputStream());
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            int longitud = in.nextInt();
            int vectorCliente[] = new int[longitud];

            for (int i = 0; i < vectorCliente.length; i++) {
                vectorCliente[i] = in.nextInt(); // Corregido
            }

            if (vectorCliente != null) {
                int sumaTotal = sumaTotalVector(vectorCliente);
                System.out.println("EchoServer echoing sum: " + sumaTotal);
                out.println(sumaTotal);
            }

        } catch (Exception e) {
            System.err.println("Error communicating with client");
            e.printStackTrace();
        } finally {
            try {
                if (this.socket != null) {
                    this.socket.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing socket.");
            }
        }
    }

    public static int sumaTotalVector(int[] vectorCliente) {
        int sumaTotal = 0;
        for (int i = 0; i < vectorCliente.length; i++) {
            sumaTotal += vectorCliente[i];
        }
        return sumaTotal;
    }
}
