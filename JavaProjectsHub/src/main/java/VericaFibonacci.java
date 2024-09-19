public class VericaFibonacci {
    public static void main(String[] args) {
        LerEntrada lerEntrada = new LerEntrada();
        Fibonacci fibonacci = new Fibonacci();

        int numero = lerEntrada.lerNumero();

        if (fibonacci.isFibonacci(numero)){
            System.out.println(numero + "pertence à sequência de Fibonacci.");
        }else {
            System.out.println(numero + "não pertence à sequência de Fibonacci");
        }

        lerEntrada.close();
    }
}
