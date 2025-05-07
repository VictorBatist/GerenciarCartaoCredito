package victor.gerencia.view;

import victor.gerencia.model.CartaoDeCredito;
import victor.gerencia.model.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite total do cartao:");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int opcao = 1;

        while (opcao != 0){
            System.out.println("Descricao da compra:");
            String descricao = scanner.next();

            System.out.println("Informe o preco da compra:");
            double preco = scanner.nextDouble();

            Compra compra = new Compra(descricao,preco);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                opcao = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartaoDeCredito.getCompras());
        for (Compra c : cartaoDeCredito.getCompras()) {
            System.out.println(c.getDescricao() + " - " +c.getPreco());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartaoDeCredito.getSaldo());

    }

}
