package java_exemplos;

public class OperacaoTernaria {
    public static void main(String[] args) {

        double price = 34.5;
        // pre�o menor que 20? Se sim price * 0.1 senao price * 0.5
        double desconto = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.println(desconto);
    }
}

