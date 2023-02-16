import java.util.ArrayList;
import java.util.Scanner;

import Produto.Produto;
import Relatorio.Relatorio;

public class App {

    public static void main(String[] args) throws Exception {

        Relatorio mercearia = new Relatorio();
        
        Produto leite = new Produto(20, 1.85, 1.44, "branco");
        Produto ovo = new Produto(100, 0.38, 1.67, "fragil");
        Produto macarrao = new Produto(2, 3.38, 1.31, "massa");

        // ArrayList<Produto> listaDeCompras = new ArrayList<>();

        // listaDeCompras.add(leite);
        // listaDeCompras.add(ovo);
        // listaDeCompras.add(macarrao);

        Scanner console = new Scanner (System.in);
        int opcao = 0;
        int quantidade;

        while(opcao != 1) {            

            System.out.print("|-------------------------------|\n");
            System.out.print("| Opção 1 - Sair                |\n");
            System.out.print("| Opção 2 - Comprar produto     |\n");
            System.out.print("| Opção 3 - Vender produto      |\n");
            System.out.print("| Opção 4 - Gerar relatório     |\n");
            System.out.print("| Opção 5 - Ver estoque         |\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("Digite uma opção: ");

            opcao = console.nextInt();

            switch (opcao) {
            case 1:
                System.out.print("\nAté logo!\n");
                console.close(); 
                break;

            case 2:
                System.out.print("\nDigite a quantidade desejada: ");
                quantidade = console.nextInt();
                ovo.adicionaProduto(quantidade);

                double valorCusto = ovo.getCusto() * quantidade;
                mercearia.adicionarCusto(valorCusto);
                break;

            case 3:
                System.out.print("\nDigite a quantidade desejada: ");
                quantidade = console.nextInt();
                ovo.removeProduto(quantidade);

                double valorVenda = ovo.getVenda() * quantidade;;
                mercearia.adicionarVenda(valorVenda);
                break;
            case 4:
                mercearia.gerarRelatorio();
                break;
            case 5:
                System.out.print("\nVerificando estoque de ovos: \n");
                ovo.verificarQuantidade();
                break;
            default:
                break;
            }
        }
    }

    // public void gerarCompra(Relatorio mercearia, Produto produto, int quantidade) {
    //     produto.adicionaProduto(quantidade);

    //     double valorCusto = produto.getCusto() * quantidade;
    //     mercearia.adicionarCusto(valorCusto);
    // }

    // public void gerarVenda(Produto produto, int quantidade) {
    //     produto.removeProduto(quantidade);

    //     double valorVenda = produto.getVenda() * quantidade;
    //     mercearia.adicionarVenda(valorVenda);
    // }

    // public void gerarRelatorio(){

    // }
}
