import java.util.Scanner;

public class LerEntrada {
    private Scanner scanner;

    public LerEntrada() {
        scanner = new Scanner(System.in);
    }

    public int lerNumero(){
        System.out.print("Digite um numero:  ");
        return scanner.nextInt();
    }

    public void close(){
        scanner.close();
    }
}
