package Principal;

public class Circulo extends Forma
{
    private double raio;
    public Circulo(Ponto2D[] pontos) //construtor com parâmetros
    {
        super(pontos); //a palavra super chama o construtor da superclasse
        this.raio = pontos[0].calculaDistancia(pontos[1]);
    }

    //método para obter o valor do raio
    public double getRaio(){
        return raio;
    }

    //método para definir o valor do raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }
}
