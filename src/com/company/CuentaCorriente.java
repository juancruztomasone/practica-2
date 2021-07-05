package com.company;

public class CuentaCorriente {
    double saldo;
    int nCuenta;
    String moneda;
    String usuario;

    public CuentaCorriente(CuentaCorriente cc) {
        this.saldo = cc.saldo;
        this.nCuenta = cc.nCuenta;
        this.moneda = cc.moneda;
        this.usuario = cc.usuario;
    }

    public CuentaCorriente(double saldo, int nCuenta, String moneda, String usuario) {
        this.saldo = saldo;
        this.nCuenta = nCuenta;
        this.moneda = moneda;
        this.usuario = usuario;
    }

    public Double ingreso(double quantity){
        this.saldo = this.saldo + quantity;

        return this.saldo;
    }

    public Double egreso(double quantity){
        this.saldo = this.saldo - quantity;

        return this.saldo;
    }

    public void reintegro(){

    }

    public void transferencia(){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
