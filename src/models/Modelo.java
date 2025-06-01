package models;

public class Modelo {

    private int cuenta;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int sumarUnoCuenta() {
        this.cuenta += 1;
        return this.cuenta;
    }

    public int restarUnoCuenta() {
        this.cuenta = ((this.cuenta - 1) <= 0) ? 0 : this.cuenta - 1;
        return this.cuenta;
    }

}
