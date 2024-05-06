public class MainGasolinera {
    public static void main(String[] args) {
        Gasolinera g = new Gasolinera();
        g.Litros_por_Galon = 3.78541;
        g.precioPorLitro = 20.0; 
        g.galonesSurtidos = 10; 
        g.mostrarPreciso();
        System.out.println(g.calcular());
    }
}