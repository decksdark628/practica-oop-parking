import java.util.HashMap;

public class Parking{
    private HashMap<String, Vehiculo> vehiculos = new HashMap<>();
    private static GestorEntradasSalidas gestorEntSal;

    public Parking(HashMap vehiculos){
        this.vehiculos = vehiculos;
    }

    public void registrarEntrada(String placa){
        Vehiculo v = buscarVehiculo(placa);
        if (v == null)
            registrarVehiculo(placa);
        gestorEntSal.registrarEntradaVehicExistente(v);
    }
    
    public boolean registrarSalida(String placa){
        boolean conf = false;
        Vehiculo v = buscarVehiculo(placa);
        if (v != null){
            gestorEntSal.registrarSalida(v);
            conf = true;
        }
        return conf;        
    }

    private Vehiculo buscarVehiculo(String placa){
        return vehiculos.get(placa);
    }

    private void registrarVehiculo(String placa){
        NoResidente v = new NoResidente(placa);
        vehiculos.put(placa, v);
    }
}