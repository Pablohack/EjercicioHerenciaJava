package org.example;

public class CuentaAhorro extends Cuenta{
    private boolean active;

    public CuentaAhorro(float saldo, float tasaAnual){
        super(saldo,tasaAnual);
        if(saldo >= 10000){
            this.active = true;
        }
        else{
            this.active = false;
        }
    }

    public void consignar(float cantidad){
        if(this.active){
            super.consginar(cantidad);
        }
    }

    public void estadoCuentaAhorro(){
        System.out.println("Estado de la cuenta es: " + this.active);
    }

}
