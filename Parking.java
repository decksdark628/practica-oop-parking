import java.util.HashMap;

public class Parking{
    private HashMap<String, Vehiculo> vehiculos = new HashMap<>();

    public Parking(HashMap vehiculos){
        this.vehiculos = vehiculos;
    }

    public void registrarEntrada(String placa){
        Vehiculo v = buscarVehiculo(placa);
        if (v == null)
            registrarVehiculo(placa);
        v.registrarUltimoIngreso();
    }
    
    public boolean registrarSalida(String placa){
        boolean conf = false;
        Vehiculo v = buscarVehiculo(placa);
        if (v != null){
            v.registrarSalida();
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