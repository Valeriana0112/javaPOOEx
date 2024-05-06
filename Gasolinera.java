public class Gasolinera {
    public double Litros_por_Galon ;
    public double precioPorLitro ,litros ,nuevoPrecio ,galonesSurtidos;


    
    

    
    public double calcular( ) {
        double litros = galonesSurtidos * Litros_por_Galon;
        return litros * precioPorLitro;
    }

    
    public void setPrecioPorLitro(double nuevoPrecio) {
        this.precioPorLitro = nuevoPrecio;
    }
    public void mostrarPreciso(){
        System.out.println("El precio por 10 galones es:");
    }
}

