import java.time.LocalDateTime;
import java.time.Duration;

public class NoResidente extends Vehiculo{
    public static final double PRECIO_POR_MINUTO = 0.02;
    private double tiempoAcumulado;

    public NoResidente(String placa){
        super(placa);
    }

    public void registrarSalida(){
		LocalDateTime ingreso = super.getUltimoIngreso();
        LocalDateTime salida = LocalDateTime.now();

        long minutosTranscurridos = Duration.between(ingreso, salida).toMinutes();

        tiempoAcumulado = (int)minutosTranscurridos;
	}
    
    private void reiniciarTiempoAcumulado(){
        tiempoAcumulado = 0;
    }
    
}
