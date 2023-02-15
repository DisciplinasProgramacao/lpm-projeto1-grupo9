package Estoque;

import Produto.Produto;

public class Estoque {
    private int estoqueMinimo;
    private int estoqueAtual;
    private Produto produto;

    public void verificarEstoque(){
        if(estoqueAtual < estoqueMinimo) {
            System.out.println("O estoque está abaixo do mínimo para o funcionamento do estabelecimento");
        } else {
            System.out.println("O estabelecimento pode funcionar normalmente");
        }
        System.out.println("Quantidade atual:" + estoqueAtual + "Quantidade mínima:" + estoqueMinimo);
    }
}
