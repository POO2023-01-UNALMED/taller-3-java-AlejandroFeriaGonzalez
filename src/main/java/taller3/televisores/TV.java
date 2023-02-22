package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1, precio = 500, volumen = 1; // valores por defecto
    private boolean estado; // televisor encendido o apagado
    private Control control;
    private static int numTV;

    public static int getNumTV() {
        return numTV;
    }

    //metodos de encendido y apagado
    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }



}
