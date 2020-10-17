package dpo3_u2_a2_pivm;

public class Boleto {

    int id;
    String marca;
    String modelo;
    String color;
    String placas;
    String estadoVehiculo;
    String Acomodador;
    String Ubicacion;

    public Boleto() {
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getplacas() {
        return placas;
    }

    public void setplacas(String placas) {
        this.placas = placas;
    }

    public String getestadoVehiculo() {
        return estadoVehiculo;
    }

    public void setestadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getAcomodador() {
        return Acomodador;
    }

    public void setAcomodador(String Acomodador) {
        this.Acomodador = Acomodador;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
}
