import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Logica_ extends Thread{ // texto reverse  multi

    private Socket socket;

    public Logica_(Socket socket) {
        this.socket = socket;
    }

    public void handle() {
        this.start();
    }

    public void run() {

        try (Scanner in = new Scanner(socket.getInputStream());
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true))
        {
            String nombre = in.nextLine();
            String genero = in.nextLine();


            switch (genero) {

                case "Terror":
                    String[] terror = {"Anavela", "La llorrona", "Chucky", "El aro", "El conjuro"};

                    for (String pelicula : terror) {
                        out.println(pelicula);
                    }

                    String peliculaSeleccionada = in.nextLine();
                    boolean peliculaEncontrada = false;

                    for (int i = 0; i < terror.length; i++) {
                        if (peliculaSeleccionada.equals(terror[i])) {
                            peliculaEncontrada = true;
                            break;
                        }
                    }

                    if (!peliculaEncontrada) {
                        out.println("La película que eligió no existe en la lista");
                    } else {
                        out.println(nombre + " acaba de elegir la película: " + peliculaSeleccionada + " del género Terror");
                    }
                    break;

                case "Comedia":
                    String[] comedia = {"Son como niños", "Mr. Bean", "Los tontos", "Scary Movie", "La jungla"};

                    for (String pelicula : comedia) {
                        out.println(pelicula);
                    }

                    String peliSeleccionada = in.nextLine();
                    boolean existeComedia = false;

                    for (String pelis : comedia) {
                        if (peliSeleccionada.equals(pelis)) {
                            existeComedia = true;
                            break;
                        }
                    }

                    if (!existeComedia) {
                        out.println("La película que eligió no existe en la lista");
                    } else {
                        out.println(nombre + " acaba de elegir la película: " + peliSeleccionada + " del género Comedia");
                    }
                    break;

                case "Anime":
                    String[] anime = {"Naruto", "One Piece", "Shigatsu no Kimi no Uso", "Dragon Ball", "Shingeki no Kyojin"};

                    for (String pelicula : anime) {
                        out.println(pelicula);
                    }

                    String peliAnimeSelect = in.nextLine();
                    boolean existeAnime = false;

                    for (String pelis : anime) {
                        if (peliAnimeSelect.equals(pelis)) {
                            existeAnime = true;
                            break;
                        }
                    }

                    if (!existeAnime) {
                        out.println("La película que eligió no existe en la lista");
                    } else {
                        out.println(nombre + " acaba de elegir la película: " + peliAnimeSelect + " del género Anime");
                    }
                    break;

                case "Accion":
                    String[] accion = {"Los indestructibles", "Boca", "Terminator", "Rocky", "Misión imposible"};

                    for (String pelicula : accion) {
                        out.println(pelicula);
                    }

                    String peliAccionSelect = in.nextLine();
                    boolean existeAccion = false;

                    for (String pelis : accion) {
                        if (peliAccionSelect.equals(pelis)) {
                            existeAccion = true;
                            break;
                        }
                    }

                    if (!existeAccion) {
                        out.println("La película que eligió no existe en la lista");
                    } else {
                        out.println(nombre + " acaba de elegir la película: " + peliAccionSelect + " del género Acción");
                    }
                    break;

                default:
                    out.println("El género que seleccionó no existe");
            }



        } catch (Exception e) {
            System.err.println("Error communicating with client");
            e.printStackTrace();
        }

        if (this.socket != null) {
            try {
                this.socket.close();
            } catch (IOException e) {
                System.err.println("Error closing socket.");
            } finally {
                this.socket = null;
            }
        }
    }


}