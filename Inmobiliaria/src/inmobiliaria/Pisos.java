package inmobiliaria;

public class Pisos {

     
    String Dir = "";    //guarda la direccion
    double PB = 0;      //Precio Base
    double A = 0;       //para calculos segun area
    int Años = 0;       //para definir si tiene menos de 15 años o más.
    int Niv = 0;        //para definir si es 3ro o mas
    
    
    public Pisos(String _Dir, double _PB, double _A, int _Años, int _Niv) {
        this.Dir = _Dir;
        this.PB = _PB;
        this.A = _A;
        this.Años = _Años;
        this.Niv = _Niv;
        
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

    public int getNiv() {
        return Niv;
    }

    public void setNiv(int Niv) {
        this.Niv = Niv;
    }

        public void mostrarDatosPisos() {
        System.out.println("El inmueble esta ubicado en " + Dir + "\nEn el nivel " + Niv + "\nCon un area de " + A + "\ncon una antiguedad en años de " + Años);
        System.out.println("El valor del inmueble es:");
        System.out.printf(" $ %.0f %n", PB);
    }

}
