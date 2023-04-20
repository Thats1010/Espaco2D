package Principal;
import java.util.ArrayList; // Importa a classe ArrayList para armazenar as formas criadas

public class Teste {

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>(); // Cria um ArrayList para armazenar as formas criadas

        Ponto2D pontoA = new Ponto2D(0, 0);
        Ponto2D pontoB = new Ponto2D(3, 0);
        Ponto2D pontoC = new Ponto2D(0, 4);

        // Criando um array com os três pontos
        Ponto2D[] pontosTriangulo = { pontoA, pontoB, pontoC };

        // Criando um objeto Triangulo com o array de pontos
        Triangulo triangulo = new Triangulo(pontosTriangulo);

        //formas.add(new Triangulo(new Ponto2D(0, 0), new Ponto2D(0, 5), new Ponto2D(5, 0))); // Adiciona um Triângulo ao ArrayList
        boolean add = formas.add(new Circulo(new Ponto2D[]{new Ponto2D(0, 0)});// Adiciona um Círculo ao ArrayList
        //formas.add(new Quadrado(new Ponto2D(0, 0), new Ponto2D(0, 4), new Ponto2D(4, 0), new Ponto2D(4, 4))); // Adiciona um Quadrado ao ArrayList

        double areaTotal = 0; // Inicializa a variável para armazenar a área total das formas
        double perimetroTotal = 0; // Inicializa a variável para armazenar o perímetro total das formas

        for (Forma forma : formas) { // Itera sobre as formas no ArrayList
            if (forma instanceof Triangulo) { // Verifica se a forma é um Triângulo
                System.out.println("Triângulo " + ((Triangulo) forma).gettipoTriangulo()); // Imprime o tipo do Triângulo
            }
            areaTotal += forma.calculaArea(); // Calcula a área da forma e adiciona à área total
            perimetroTotal += forma.calculaPerimetro(); // Calcula o perímetro da forma e adiciona ao perímetro total
        }

        System.out.println("Área total: " + areaTotal); // Imprime a área total das formas
        System.out.println("Perímetro total: " + perimetroTotal); // Imprime o perímetro total das formas
    }
}
