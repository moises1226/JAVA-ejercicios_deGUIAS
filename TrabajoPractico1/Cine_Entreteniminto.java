public class Cine_Entreteniminto
{


    private int[][] asientos =
            {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0}, //4x8
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},

            };


    private int asiento;


    public Cine_Entreteniminto(){};


    public int  getAsiento (){

        return this.asiento;

    }

    public void setAsiento (int as){

        this.asiento = as;

    }


     public void AsignacioDeAsiento(int fil , int col){


                if(asientos[fil][col] == 0){

                    asientos[fil][col] = 1;

                }else{

                    System.out.println("El asiento que quiere comprar esta agotado");

                }


            }


        }

     }





     };








