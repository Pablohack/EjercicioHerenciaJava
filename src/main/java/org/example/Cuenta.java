package org.example;

public class Cuenta {
    // nuestra clase padre
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;

public Cuenta(float saldo, float tasaAnual){
    this.saldo = saldo;
    this.tasaAnual = tasaAnual;
}

public  void consginar(float cantidad){
    this.saldo = this.saldo + cantidad;
    this.numeroConsignaciones = this.numeroConsignaciones +1;
}

public void retirar(float cantidad){
    float nuevoSaldo = this.saldo - cantidad;
    if(nuevoSaldo >= 0){
        this.saldo = this.saldo - cantidad;
        this.numeroRetiros = this.numeroRetiros +1 ;
    }
    else{
        System.out.println("La cantidad a retirar excede el saldo actual");
    }
}
public void mostrarSaldo(){
    System.out.println("El saldo de la cuenta es: " + this.saldo);
}

}