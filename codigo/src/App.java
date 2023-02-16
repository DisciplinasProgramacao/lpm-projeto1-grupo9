import java.util.ArrayList;
import java.util.Scanner;

import Produto.Produto;
import Relatorio.Relatorio;

public class App {

    public static void main(String[] args) throws Exception { 
        // cadastrando produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(100, 1.42, 1.57, "Leite"));
        produtos.add(new Produto(350, 0.17, 1.73, "Ovo"));
        produtos.add(new Produto(26, 2.42, 1.36, "Macarrão"));
        produtos.add(new Produto(18, 0.82, 1.44, "Melancia"));

        Relatorio mercearia = new Relatorio();

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

                break;

            case 3:

                break;
            case 4:
                mercearia.geraRelatorioTotal(produtos);
                break;
            case 5:

                break;
            default:
                break;
            }
        }
    }
}
