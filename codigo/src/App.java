import java.util.ArrayList;
import java.util.Scanner;

import Produto.Produto;
import Relatorio.Relatorio;

public class App {

    static Scanner console = new Scanner (System.in);
    static int opcao = 0;
    static String produto;

    public static void main(String[] args) throws Exception { 
        // cadastrando produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(100, 1.42, 1.57, "Leite"));
        produtos.add(new Produto(350, 0.17, 1.73, "Ovo"));
        produtos.add(new Produto(26, 2.42, 1.36, "Macarrão"));
        produtos.add(new Produto(18, 0.82, 1.44, "Melancia"));

        Relatorio mercearia = new Relatorio();

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
            console.nextLine();

            switch (opcao) {
            case 1:
                System.out.print("\nAté logo!\n");
                console.close(); 
                break;

            case 2:
                geraCompra(produtos);
                break;

            case 3:
                geraVenda(produtos);
                break;
            case 4:
                mercearia.geraRelatorioTotal(produtos);
                break;
            case 5:
                System.out.println("Insira o produto: ");
                produto = console.nextLine();
                mostraEstoque(mercearia, produtos, produto);
                break;
            default:
                break;
            }
        }
    }


    public static void geraCompra(ArrayList<Produto> produtos){
        System.out.println("Insira o produto: ");
        String pDescricao = console.nextLine();

        System.out.println("Insira a quantidade: ");
        int pQuantidade = console.nextInt();

        boolean flag = false;

        for(Produto p: produtos) {
            if(p.getDescricao().toLowerCase().equals(pDescricao.toLowerCase())) {
                p.adicionaQuantidade(pQuantidade);
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("Produto não listado.");
        }
    }

    public static void geraVenda(ArrayList<Produto> produtos){
        System.out.println("Insira o produto: ");
        String pDescricao = console.nextLine();

        System.out.println("Insira a quantidade: ");
        int pQuantidade = console.nextInt();

        boolean flag = false;

        for(Produto p: produtos) {
            if(p.getDescricao().toLowerCase().equals(pDescricao.toLowerCase())) {
                if(pQuantidade <= p.getQuantidadeAtual()) {
                    p.removeQuantidade(pQuantidade);
                    flag = true;
                } else {
                    System.out.println("Estoque indisponível.");
                    flag = true;
                }
                break;
            }
        }

        if(!flag) {
            System.out.println("Produto não listado.");
        }
    }

    public static void mostraEstoque(Relatorio mercearia, ArrayList<Produto> produtos, String produto) {
        boolean flag = false;
        for(Produto p: produtos) {
            if(p.getDescricao().toLowerCase().equals(produto.toLowerCase())) {
                mercearia.verificaQuantidade(p);
                flag = true;
                break;
            } 
        }
        if(!flag) {
            System.out.println("Produto não listado.");
        }
    }
}
