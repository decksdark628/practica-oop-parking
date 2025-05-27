public class NoResidente extends Vehiculo{
    public static final double PRECIO_POR_MINUTO = 0.02;
    private double tiempoAcumulado;

    public NoResidente(String placa){
        super(placa);
    }
    
    private void reiniciarTiempoAcumulado(){
        tiempoAcumulado = 0;
    }
    
}
