import java.util.Arrays;

public class act6 {
    public static void main(String[] args) {
        //Se insertan los datos que van dentro de los dos ejemplos de alumnos
        double[] cali= {91.2,85.2,90.0,71.3,92.1};
        Alumno alumno = new Alumno("Alfredo",cali);
        double[] cali2= {81.1,43.2,100.0,51.3,92.1};
        Alumno alumno2 = new Alumno("Leonardo",cali2);

        //Calcula e Imprime el los datos del primer alumno
        Double promedio = promedio(alumno.calificacion);
        String calificacion = calificacion(promedio);
        imprimirCalificacion(alumno, promedio, calificacion);
        //Calcula e Imprime el los datos del segundo alumno
        Double promedio2 = promedio(alumno2.calificacion);
        String calificacion2 = calificacion(promedio);
        imprimirCalificacion(alumno2, promedio2, calificacion2);
    }
    public static double promedio(double[] calificacion) {
        double promedio= Arrays.stream(calificacion).sum();
        promedio= promedio/ calificacion.length;
        return promedio;}

    public static String calificacion(Double promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";}
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";}
        if (promedio>=61 && promedio<=70) {
            calificacion="D";
        }else if(promedio>=71 && promedio<=80){
            calificacion="C";
        }else if (promedio>=81 && promedio<=90){
            calificacion="B";
        }else calificacion="A";

        return calificacion;}
    public static void imprimirCalificacion(Alumno alumno, Double promedio, String calificacion) {
        System.out.println("********\n Nombre del estudiante: " + alumno.nombre);
        int x=0;
        for(double i: alumno.calificacion){
            System.out.println("Calificación "+(x+1)+": "+alumno.calificacion[x]);
            x++;}
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
