package Relatorio;

import java.util.ArrayList;

import Produto.Produto;

public class Relatorio {
    
    public void geraRelatorioTotal(ArrayList<Produto> produtos) {
        System.out.println("Relatório Total:");
        for(Produto p : produtos) {
            System.out.printf("\nProduto: %s\n", p.getDescricao());
            System.out.printf("Quantidade comprada: %d\n", p.getQuantidadeComprada());
            System.out.printf("Custo total: %.2f\n", p.getCustoTotal());
            System.out.printf("Quantidade vendida: %d\n", p.getQuantidadeVendida());
            System.out.printf("Venda total: %.2f\n", p.getVendaTotal());
        }
    }

    // Um produto deve ser monitorado para saber se sua quantidade atual em estoque está abaixo 
    // do mínimo necessário para funcionamento da mercearia. 
    public void verificaQuantidade(Produto p){
        if(p.getQuantidadeAtual() < p.getQuantidadeMinima()) {
            System.out.println("O estoque está abaixo do mínimo para o funcionamento do estabelecimento");
        } else {
            System.out.println("O estabelecimento pode funcionar normalmente");
        }
        System.out.printf("Quantidade atual: %d\nQuantidade mínima: %d\n", p.getQuantidadeAtual(), p.getQuantidadeMinima());
    }

    // public void geraRelatorioProdutoUnico(Produto p) {
    //     System.out.printf("Relatório %s:\n", p.getDescricao());
    //     System.out.printf("Quantidade comprada: %d\n", p.getQuantidadeComprada());
    //     System.out.printf("Custo total: %d\n", p.getCustoTotal());
    //     System.out.printf("Quantidade vendida: %s\n", p.getQuantidadeVendida());
    //     System.out.printf("Venda total: %s\n", p.getVendaTotal());
    // }
}
