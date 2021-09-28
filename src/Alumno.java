public class Alumno {
    public String nombre;
    public double[] calificacion= new double[4];

    public Alumno(){}

    public Alumno(String nom, double[] cal){
       nombre=nom;
       calificacion=cal;
    }
}
