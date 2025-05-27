import java.time.LocalTime;

public abstract class Vehiculo{
    private String placa;
    private LocalTime ultimoIngreso;

    public Vehiculo(String placa){
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalTime getUltimoIngreso() {
        return this.ultimoIngreso;
    }

    public void setUltimaEntrada(LocalTime ultimoIngreso) {
        this.ultimoIngreso = ultimoIngreso;
    }

    public String toString() {
        return " Placa: " + getPlaca() +
            ", Ultimo ingreso: " + getUltimoIngreso();
    }

}