import java.time.LocalDateTime;
import java.time.Duration;

public class NoResidente extends Vehiculo implements PagaAlSalir{
    public static final double PRECIO_POR_MINUTO = 0.02;
    private double precioAPagar;

    public NoResidente(String placa){
        super(placa);
    }

    public void registrarSalida(){
		LocalDateTime ingreso = super.getUltimoIngreso();
        LocalDateTime salida = LocalDateTime.now();

        long minutosTranscurridos = Duration.between(ingreso, salida).toMinutes();

        precioAPagar = (int)minutosTranscurridos * PRECIO_POR_MINUTO;
        super.setUltimaEntrada(null);
	}

    public double getPrecioAPagar() {
        return this.precioAPagar;
    }

    public void setPrecioAPagar(double precioAPagar) {
        this.precioAPagar = precioAPagar;
    }
}
