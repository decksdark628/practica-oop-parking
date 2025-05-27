import java.time.LocalTime;
import java.util.ArrayList;

public class Oficial extends Vehiculo{
    private ArrayList<LocalTime> estancias = new ArrayList<>();
    
    public Oficial(String placa){
        super(placa);
    }

    private void reiniciarEstancias(){
        estancias.clear();
    }
}
