import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        // Ejemplo de uso
        Password password1 = new Password();
        System.out.println("Contraseña 1: " + password1.getContraseña());
        System.out.println("¿Es fuerte? " + password1.esFuerte());

        Password password2 = new Password(12);
        System.out.println("Contraseña 2: " + password2.getContraseña());
        System.out.println("¿Es fuerte? " + password2.esFuerte());
    
     Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de contraseñas: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        Password[] contraseñas = new Password[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la longitud de la contraseña " + (i + 1) + ": ");
            
            scanner.nextLine(); 

            System.out.print("Ingrese la contraseña " + (i + 1) + ": ");
            String contraseña = scanner.nextLine();

            contraseñas[i] = new Password(contraseña);
        }

        boolean[] esFuerteArray = new boolean[cantidad];
        for (int i = 0; i < cantidad; i++) {
            esFuerteArray[i] = contraseñas[i].esFuerte();
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Contraseña " + (i + 1) + ": " + contraseñas[i].password +
                    " - ¿Es fuerte? " + (esFuerteArray[i] ? "Sí" : "No"));
        }
    }
}