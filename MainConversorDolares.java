import java.util.Scanner;
public class MainConversorDolares {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el tipo de cambio:");
    double pesos = scanner.nextDouble();
    System.out.print("Ingresa la cantidad en pesos para convertir a dólares: ");
    double tipoDeCambio  = scanner.nextDouble();
    ConversorDolares D = new ConversorDolares();
    D.pesos=pesos;
    D.tipoDeCambio=tipoDeCambio;
    System.out.println(D.Convertir());

   
}
}
