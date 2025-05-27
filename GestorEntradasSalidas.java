import java.time.LocalTime;

public class GestorEntradasSalidas{

    public void registrarEntradaVehicExistente(Vehiculo v){
        LocalTime time = LocalTime.now();
        v.setUltimaEntrada(time);
    }

    public void registrarSalida(Vehiculo v){
        if (v instanceof Oficial)
            regSalidaOficial(v);
        else if (v instanceof Residente)
            regSalidaResidente(v);
        else if (v instanceof NoResidente)
            regSalidaNoResidente(v);
        else
            System.out.println("Error: not a valid car type"); // TODO delete
    }

    private void regSalidaOficial(Vehiculo v){
        Oficial vOficial = (Oficial)v;
        LocalTime ingreso = vOficial.getUltimoIngreso();
        LocalTime salida = LocalTime.now();
        Estancia estancia = new Estancia(ingreso, salida);
        vOficial.getEstancias().add(estancia);
    }

    private void regSalidaResidente(Vehiculo v){

    }

    private void regSalidaNoResidente(Vehiculo v){

    }
}