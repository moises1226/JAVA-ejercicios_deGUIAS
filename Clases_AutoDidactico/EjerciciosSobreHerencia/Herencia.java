package EjerciciosSobreHerencia;

public class herencia {

        public static void main(String[] args){


            Empleado empleado1 = new Empleado( 1, "SuperVisor", 12.000, 1, "99999", "Jorge", "Sartes", "Demem123", "111");

            System.out.println(empleado1.getNum_legajo());
            System.out.println(empleado1.getApellido());

            consultor consulta1  = new consultor(1, "4444", "Sergio", "Denichi","Menes111", "2222","Revision de Cuidado Electronico", 1);

            System.out.println(consulta1.getNombre_Consultora());
            System.out.println(consulta1.getNum_Consultor());
            System.out.println("nombre:" + consulta1.getNombre());





        }



}
