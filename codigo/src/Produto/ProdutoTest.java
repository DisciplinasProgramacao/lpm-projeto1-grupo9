package Produto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ProdutoTest {

    static private final double IMPOSTO = 0.18;
    Produto produto = new Produto(30,4.74,1.55,"Arroz (1kg)");


    @Test
    public void deveCalcularValorDeVenda() {
        double expectedResult = (1 + IMPOSTO) * (produto.getCusto() * produto.getLucro());
        assertEquals(expectedResult, produto.getVenda(), 0.001);
    }

    @Test
    public void deveFalharNaValidacaoDoLucro() {
        assertFalse(produto.validacoes(3.80, "produto"));
    }

    @Test
    public void deveFalharNaValidacaoDaDescricao() {
        assertFalse(produto.validacoes(1.45, "a"));
    }

    @Test
    public void deveAdicionarQuantidade() {
        produto.adicionaQuantidade(50);
        assertEquals(50, produto.getQuantidadeAtual());
    }

    @Test
    public void deveRemoverQuantidade() {
        produto.adicionaQuantidade(20);
        produto.removeQuantidade(10);
        assertEquals(10, produto.getQuantidadeAtual());
    }

}
