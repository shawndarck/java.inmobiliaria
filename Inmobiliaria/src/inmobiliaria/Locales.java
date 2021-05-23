/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliaria;

/**
 *
 * @author JULIAN PAREDES
 */
public class Locales {

    String Dir = "";    //guarda la direccion+
    double PB = 0;      //Precio Base
    double A = 0;      //para calculos segun area+
    int Años = 0;       //para definir si tiene menos de 15 años o más.+
    int V = 0;          //para calculos segun ventanas+

    public Locales(String _Dir, double _PB, double _A, int _Años, int _V) {
        this.Dir = _Dir;
        this.PB = _PB;
        this.A = _A;
        this.Años = _Años;
        this.V = _V;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public double getPB() {
        return PB;
    }

    public void setPB(double PB) {
        this.PB = PB;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public int getAños() {
        return Años;
    }

    public void setAños(int Años) {
        this.Años = Años;
    }

    public int getV() {
        return V;
    }

    public void setV(int V) {
        this.V = V;
    }

    public void mostrarDatosLocales() {
        System.out.println("El local esta ubicado en " + Dir + "\nCon un area de " + A + "\ncon una antiguedad en años de " + Años+"\nCon un numero de ventanas "+V);
        System.out.println("El valor del inmueble es:");
        System.out.printf(" $ %.0f %n", PB);
    }
}