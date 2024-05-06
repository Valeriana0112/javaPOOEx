

import java.util.Random;

public class Password {
    public String password;
    public int longitud;
    public  String contraseña;




public Password() {
    this.longitud = 8;
    generarPassword();
}


public Password(int longitud) {
    this.longitud = longitud;
    generarPassword();
}
public Password(String password) {
    this.password = password;
}
public boolean esFuerte2() {
    
    return password.length() >= 8 && password.matches(".*\\d.*");
}


public boolean esFuerte() {
    int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    
    private void generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contraseña = sb.toString();
    }

    // Métodos getter y setter
    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
}


