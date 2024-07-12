
// Trabajo realizado por : Moises Aguilar y Aylen Molina
// Fecha de entrega: 12/07/2024
// Proyecto: Titanes Pasificos


public class Creacion {


    public static void main(String[] args) {



        Kaiju Netereo = new Kaiju("Netero", "Saturno", 900, "Titanio", 3000, 2000, 2300, 220, 88, "Garras", "", 5 );

        System.out.println(Netereo.getNombreDanioHabilidad_K());
        System.out.println(Netereo.PoderDePelea());




        Jaegar NaoGET = new Jaegar("Jet", "NaoGET", 900, true, 200, 2000, "Garras nucleares","Bombas Eco");
        System.out.println(NaoGET.PoderDePelea());
        System.out.println(NaoGET.GanarOPerder(NaoGET, Netereo));



    }




}
