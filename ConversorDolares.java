public class ConversorDolares {
    public double tipoDeCambio, pesos, dolares;

    public double Convertir() {
        this.dolares = pesos / tipoDeCambio;
        return dolares;
    }
}
