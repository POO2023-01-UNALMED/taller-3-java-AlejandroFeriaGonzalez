package test;

public class Control {
    TV tv;

    public void enlazar(TV televisor){
        televisor.setControl(this);
        this.tv = televisor;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        int nCanal = tv.getCanal() + 1;

        if (nCanal >= 1 && nCanal <= 120 && tv.getEstado() == true){
            tv.setCanal(nCanal);
        }
    }

    public void canalDown() {
        int nCanal = tv.getCanal() - 1;

        if (nCanal >= 1 && nCanal <= 120 && tv.getEstado() == true){
            tv.setCanal(nCanal);
        }
    }

    public void volumenUp() {
        int nVolumen = tv.getVolumen() + 1;
        if (nVolumen >= 0 && nVolumen <= 7 && tv.getEstado() == true){
            tv.setVolumen(nVolumen);
        }
    }

    public void volumenDown() {
        int nVolumen = tv.getVolumen() - 1;
        if (nVolumen >= 0 && nVolumen <= 7 && tv.getEstado() == true){
            tv.setVolumen(nVolumen);
        }
    }

    public void setCanal(int nCanal) {
        if (nCanal >= 1 && nCanal <= 120 && tv.getEstado() == true){
            tv.setCanal(nCanal);
        }
    }
}
