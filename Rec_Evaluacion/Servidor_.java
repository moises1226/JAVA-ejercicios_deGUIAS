import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor_ {
    public static void main(String[] args) { //Servidor multicliente


        try (ServerSocket listening = new ServerSocket(12345)){
            System.out.println("EchoServer starting.");

            while (true) {
                System.out.println("EchoServer waiting for connections on port 12345");
                Socket socket = listening.accept();

                System.out.println("EchoServer client connected");
                System.out.println("Client: " + socket.toString());

                /*Se crea un objeto para manejar al cliente, cada objeto es un Thread*/
                Logica_ handler = new Logica_(socket);

                handler.handle();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}