import java.time.LocalTime;

public class Estancia{
    LocalTime entrada;
    LocalTime salida;

    public Estancia(LocalTime e, LocalTime s){
        entrada = e;
        salida = s;
    }
    
    public LocalTime getEntrada() {
        return this.entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSalida() {
        return this.salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }    
}
