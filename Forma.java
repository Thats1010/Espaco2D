package Principal;

public abstract class Forma {
    public Ponto2D[] pontos;
    int tamanho = pontos.length; //pega o tamanho do vetor pontos
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    public Forma geraForma(Ponto2D[] pontos)
    {
        Forma retorno = null;

        //se tamanho = 3 verifico se posso gerar triangulo, verificar se a soma de dois lados é maior que o tamanho do terceiro lado
        if(geraTriangulo(pontos))
        {
            retorno = new Triangulo(pontos);
        }
        //se tamanho = 2 verificar se posso gerar circulo, tem que ver se a distancia é maior que zero
        if(geraCirculo(pontos))
        {
            retorno = new Circulo(pontos);
        }
        //se tamanho = 4 verificar se posso gerar quadrado, ver se o tamanho dos lados é igual
        if(geraQuadrado(pontos))
        {
            retorno = new Quadrado(pontos);
        }
        return null;
    }

    public Forma (Ponto2D[] pontos)
    {

    }
    private boolean geraTriangulo(Ponto2D[] pontos)
    {
        //colocar lógica que gera o triangulo
        if(tamanho == 3) {
            this.lado1 = pontos[0].calculaDistancia(pontos[1]); //calculando os lados
            this.lado2 = pontos[1].calculaDistancia(pontos[2]);
            this.lado3 = pontos[2].calculaDistancia(pontos[3]);
            if (lado1 + lado2 > lado3)
                return true;
        }
        return false;
    }

    private boolean geraCirculo(Ponto2D[] pontos)
    {
        //colocar lógica que gera o círculo
        if(tamanho == 2){
            this.lado1 = pontos[0].calculaDistancia(pontos[1]);
            if(lado1 != 0)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    private boolean geraQuadrado(Ponto2D[] pontos)
    {
        //colocar lógica que gera o quadrado
        if(tamanho == 4){
            this.lado1 = pontos[0].calculaDistancia(pontos[1]); //calculando os lados
            this.lado2 = pontos[1].calculaDistancia(pontos[2]);
            this.lado3 = pontos[2].calculaDistancia(pontos[3]);
            this.lado4 = pontos[3].calculaDistancia(pontos[4]);
            if(lado1 == lado2 && lado2 == lado3 && lado3 == lado4)
                return true;
        }
        return false;
    }


    public abstract double calculaArea();
    public abstract double calculaPerimetro();


}
