import java.util.HashMap;
import java.util.ArrayList;

public class Parking{
    private HashMap<String, Vehiculo> vehiculos = new HashMap<>();
    private static GeneradorInformes genInf;

    public Parking(HashMap<String, Vehiculo> vehiculos){
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

    //hasmap returns replaced value or null
    public boolean darAltaOficial(String placa){
        Vehiculo temp = null;
        Vehiculo v = new Oficial(placa);
        temp = vehiculos.replace(placa, v);

        return temp != null;
    }
    
    public boolean darAltaResidente(String placa){
        Vehiculo temp = null;
        Vehiculo v = new Residente(placa);
        temp = vehiculos.replace(placa, v);

        return temp != null;
    }

    public void comienzaMes(){
        for (Vehiculo v : vehiculos.values()){
            if (v instanceof ReinicioMensual){
                ReinicioMensual rm = (ReinicioMensual)v;
                rm.comienzaMes();
            }
        }
    }

    public void generarInformeResidentes(){
        ArrayList<Residente> lista = new ArrayList<>();
        for (Vehiculo v : vehiculos.values()){
            if (v instanceof Residente){
                Residente r = (Residente)v;
                lista.add(r);
            }
        }
        genInf = new GeneradorInformes();
        genInf.generarInformeResidentes(lista);
    }


    private Vehiculo buscarVehiculo(String placa){
        return vehiculos.get(placa);
    }

    private void registrarVehiculo(String placa){
        NoResidente v = new NoResidente(placa);
        vehiculos.put(placa, v);
    }
}