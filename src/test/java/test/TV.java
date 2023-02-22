package test;

public class TV {
    private Marca marca;
    private int canal = 1, precio = 500, volumen = 1; // valores por defecto
    private boolean estado; // televisor encendido o apagado
    private Control control;
    private static int numTV;

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    // metodos de encendido y apagado
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    //constructor
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    // public void canalUp() {
    //     int nCanal = this.getCanal() + 1;

    //     if (nCanal >= 1 && nCanal <= 120 && this.getEstado() == true){
    //         this.setCanal(nCanal);
    //     }
    // }

    // public void canalDown() {
    //     int nCanal = this.getCanal() - 1;

    //     if (nCanal >= 1 && nCanal <= 120 && this.getEstado() == true){
    //         this.setCanal(nCanal);
    //     }
    // }

    // public void volumenUp() {
    //     int nVolumen = this.getVolumen() + 1;
    //     if (nVolumen >= 0 && nVolumen <= 7 && this.getEstado() == true){
    //         this.setVolumen(nVolumen);
    //     }
    // }

    // public void volumenDown() {
    //     int nVolumen = this.getVolumen() - 1;
    //     if (nVolumen >= 0 && nVolumen <= 7 && this.getEstado() == true){
    //         this.setVolumen(nVolumen);
    //     }
    // }

    //getters y setters
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
