package org.example;

public class CuentaCorriente extends Cuenta{
    public float sobregiro;

    public CuentaCorriente(float saldo,float tasaAnual){
        super(saldo,tasaAnual);
        this.sobregiro = 0;
    }

    public void consignar(float cantidad){
        float residuo = this.sobregiro - cantidad;
        if(this.sobregiro > 0){
            if(residuo > 0) {
                this.sobregiro = 0;
                this.saldo = residuo;
            }
            else{
                sobregiro = residuo;
                this.saldo = 0;
            }
        }
        else{
            super.consginar(cantidad);
        }
    }

    public void retirar(float cantidad){
        float resultado = this.saldo - cantidad;
        if(resultado < 0){
            this.sobregiro = this.sobregiro - resultado;
            this.saldo = 0;
        }else{
            super.retirar(cantidad);
        }
    }

    public void mostrarSaldo(){
        System.out.println("El sobregiro es" + this.sobregiro);
        super.mostrarSaldo();
    }


}
