package inmobiliaria;

/*Una inmobiliaria vende dos tipos de Inmuebles: Pisos y Locales. Para cualquier tipo de inmueble, 
se conoce su dirección y el número de metros cuadrados. Además, para los pisos, habrá que conocer 
el piso concreto en el que se encuentra la vivienda, mientras que para los locales importará el 
número de ventanas que tenga. Además, cualquiera de estos inmuebles puede ser nuevo o de segunda mano. 
El precio de cada inmueble se calcula a partir de un precio base y una serie de características: para 
cualquier inmueble, si tiene menos de 15 años, su precio se rebaja un 1 %, mientras que si tiene más 
se reduce un 2 %. En el caso de los pisos, si es un tercero o más, su precio se incrementa un 3 %. Para 
los locales, si tienen más de 50 metros cuadrados el precio se incrementa un 1 %, si tienen 1 o ningún 
ventanal, su precio se reduce un 2% y si tienen más de 4 ventanales se añade un 2 %. */
import javax.swing.JOptionPane;
import inmobiliaria.Pisos;

public class Inmobiliaria {

    public static void main(String[] args) {

        String PL = "";     //De que tipo de inmueble P=piso, L=Local 
        String Dir = "";    //guarda la direccion+
        double PB = 0;      //Precio Base
        double A = 0;       //para calculos segun area+
        int Años = 0;       //para definir si tiene menos de 15 años o más.+
        int Niv = 0;        //para definir si es 3ro o mas
        int V = 0;          //para calculos segun ventanas+
        int NS = 0;         //Nueva o de segunda
        /*
        Se trata de piso o local?
         */
        PL = (JOptionPane.showInputDialog("Defina... ¿piso o local? 'en minusculas' "));

        switch (PL) {

            case "piso": //Este es Piso (apartamento)

                PB = Double.parseDouble(JOptionPane.showInputDialog("Digite el Precio Base: "));
                Dir = JOptionPane.showInputDialog("Introduzca la direccion ");
                A = Double.parseDouble(JOptionPane.showInputDialog("Digite el area en m2: "));
                NS = Integer.parseInt(JOptionPane.showInputDialog("Digita 1 para nuevo o 2 si es de segunda "));
                if (NS == 2) {
                    Años = Integer.parseInt(JOptionPane.showInputDialog("Digite años de antiguedad  "));
                } else {
                    Años = 1; //Cualquier valor menor de 15 sirve
                }
                //Niv = Integer.parseInt(JOptionPane.showInputDialog("Digite el piso(nivel) "));

                /*
                calculo del inmueble piso(apartamento)
                 */
                //Precio base cuando el inmueble es menor o mayor a 15 años
                if (Años < 15) {
                    PB = PB - (PB * .01);    //PB afectado por el 1%

                } else {
                    PB = PB - (PB * .02);    //PB afectado por el 2% 
                }

                //Precio base cuando el inmueble es un 3er piso o mas
                if (Niv >= 3) // 3er piso o mas
                {
                    PB = PB + (PB * .03);    //PB afectado por el 3%
                }

                Pisos entradap = new Pisos(Dir, PB, A, Años, Niv);//creo objeto entradap para pedir datos de PISO
                entradap.mostrarDatosPisos();

                break;

            case "local": //Este es Local

                PB = Double.parseDouble(JOptionPane.showInputDialog("Digite el Precio Base: "));
                Dir = JOptionPane.showInputDialog("Introduzca la direccion ");
                A = Double.parseDouble(JOptionPane.showInputDialog("Digite el area en m2: "));
                NS = Integer.parseInt(JOptionPane.showInputDialog("Digita 1 para nuevo o 2 si es de segunda "));
                if (NS == 2) {
                    Años = Integer.parseInt(JOptionPane.showInputDialog("Digite años de antiguedad  "));
                } else {
                    Años = 1; //Cualquier valor menor de 15 sirve
                }
                //Niv = Integer.parseInt(JOptionPane.showInputDialog("Digite el piso(nivel) "));
                V = Integer.parseInt(JOptionPane.showInputDialog("Digite el # de ventanas "));

                if (Años < 15) {
                    PB = PB - (PB * .01);    //PB afectado por el 1%

                } else {
                    PB = PB - (PB * .02);    //PB afectado por el 2% 
                }
                //afectacion por area mayor a 50m2
                if (A > 50) {
                    PB = PB + (PB * .01);       //PB afectado por el 1%
                }
                //afectacion por cantidad de ventanas
                if (V == 0 || V == 1) {         //de 0 a 1 ventana
                    PB = PB - (PB * .02);       //PB afectado por el -2%

                } else if (V == 2 || V == 3) {  //de 2 a 4 ventanas
                    PB = PB;                    //PB no es afectado 
                } else {                        //de mas de 4 ventanas
                    PB = PB + (PB * .02);       //PB afectado por el +2%
                }

                break;
        }
                Locales entrada1=new Locales(Dir, PB, A, Años, V);
                entrada1.mostrarDatosLocales();
                
    }
}
