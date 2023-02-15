import java.util.ArrayList;

import Produto.Produto;
import Relatorio.Relatorio;

public class App {

    Relatorio mercearia = new Relatorio();

    public static void main(String[] args) throws Exception {
       

        System.out.println("Hello, World!");
    }

    public void gerarCompra(Produto produto, int quantidade) {
        produto.adicionaProduto(quantidade);

        double valorCusto = produto.getCusto() * quantidade;
        mercearia.adicionarCusto(valorCusto);
    }

    public void gerarVenda(Produto produto, int quantidade) {
        produto.removeProduto(quantidade);

        double valorVenda = produto.getVenda() * quantidade;
        mercearia.adicionarVenda(valorVenda);
    }
}
