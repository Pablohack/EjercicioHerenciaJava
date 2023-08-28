package org.example;

public class Main {
    public static void main(String[] args) {

        //CuentaCorriente cuentaCorriente = new CuentaCorriente();
        CuentaAhorro cuentaAhorroInactive = new CuentaAhorro(5000,3);
        CuentaAhorro cuentaAhorroActive = new CuentaAhorro(15000,2);

        // cuenta corriente sin sobregiro
        CuentaCorriente  cuentaCorrienteSS = new CuentaCorriente(20000,1);

        cuentaCorrienteSS.retirar(25000);
        cuentaCorrienteSS.consignar(10000);

        cuentaCorrienteSS.mostrarSaldo();

       /* cuentaAhorroInactive.estadoCuentaAhorro();
        cuentaAhorroActive.estadoCuentaAhorro();

        cuentaAhorroInactive.consignar(20000);
        cuentaAhorroActive.consignar(5000);

        cuentaAhorroInactive.mostrarSaldo();
        cuentaAhorroActive.mostrarSaldo();*/
    }
}