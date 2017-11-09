import java.util.ArrayList;

public class MyClass {
    public static void main(String args[]) {
        int desocupadas;
        boolean resultado;
        ArrayList <Boolean>butacas;
        butacas = new ArrayList<>();
        
        for (int p = 0; p < 10; p++){
            butacas.add (false);
        }
        
    }
    
    private static int ContarButacasLibres (ArrayList <Boolean> butacas) {
        int desocupadas = 0;
        for (boolean ocupada : butacas){
            if (! ocupada){
                desocupadas ++;
            }
        }
        return desocupadas;
    }
    
    private static boolean ButacaLibre (ArrayList <Boolean> butacas, int nro) {
        return ! butacas.get(nro);
    }
    
    private static int OcuparButacas (ArrayList <Boolean> butacas,  int nro) {
        boolean libre = ButacaLibre (butacas, nro);
        if (libre){
            butacas.set (nro,true);
        }
        return libre;
    }



    private static int BuscarButacaLibre(boolean[] butacas) {
        int posicion = 0;
        while ((posicion < butacas.length) && (ButacaLibre(butacas, posicion) == false)){
        posicion++;
        }
        return posicion;
    }



    private static float PorcentajeOcupacion (boolean[] butacas) {
        float resultado;
        resultado = (float)ContarButacasOcupadas(butacas) * 100 / butacas.length;
        return resultado;
    }
    
    private static int Buscar2ButacasLibresContiguas(boolean[] butacas) {
        
    }
    
    private static int Buscar2ButacasLibresContiguas(boolean[] butacas) {
    int n;
    System.out.println ("Ingrese la cantidad de butacas que necesite");
        
    }
