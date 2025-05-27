public class Residente extends Vehiculo{
    public static final double PRECIO_POR_MINUTO = 0.002;
    private double tiempoAcumulado;

    public Residente(String placa){
        super(placa);
    }
    
    private void reiniciarTiempoAcumulado(){
        tiempoAcumulado = 0;
    }
}
