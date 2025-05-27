import java.time.LocalDateTime;
import java.time.Duration;

public class Residente extends Vehiculo{
    public static final double PRECIO_POR_MINUTO = 0.002;
    private double tiempoAcumulado;

    public Residente(String placa){
        super(placa);
    }

	public void registrarSalida(){
		LocalDateTime ingreso = super.getUltimoIngreso();
        LocalDateTime salida = LocalDateTime.now();

        long minutosTranscurridos = Duration.between(ingreso, salida).toMinutes();

        tiempoAcumulado += (int)minutosTranscurridos;
	}
    
    private void reiniciarTiempoAcumulado(){
        tiempoAcumulado = 0;
    }

    public double getTiempoAcumulado() {
        return this.tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }
}
