import java.util.ArrayList;

public class Oficial extends Vehiculo{
    private ArrayList<Estancia> estancias = new ArrayList<>();
    
    public Oficial(String placa){
        super(placa);
    }

    private void reiniciarEstancias(){
        estancias.clear();
    }

    public ArrayList<Estancia> getEstancias() {
        return this.estancias;
    }

    public void setEstancias(ArrayList<Estancia> estancias) {
        this.estancias = estancias;
    }
}
