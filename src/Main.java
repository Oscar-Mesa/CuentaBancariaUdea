public class Main {
    public static void main(String[] args) {

        //instanciar la clase
        Cuenta miCuenta = new Cuenta("123456","Ahorro",150000);
        System.out.println( "Saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
    }
}
