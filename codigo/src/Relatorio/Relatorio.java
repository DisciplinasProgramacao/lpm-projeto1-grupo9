package Relatorio;

public class Relatorio {

    private double custoTotal = 0;
    private double vendaTotal = 0;
    private double lucroTotal = 0;

    public Relatorio(){}
    
    public void gerarRelatorioCustoTotal(){
        System.out.println("Teste custo total: " + this.custoTotal);
    }

    public void gerarRelatorioVendaTotal(){
        System.out.printf("Teste venda total: " + this.vendaTotal);
    }

    public void gerarRelatorioLucroTotal(){
        System.out.println("Teste lucro total: " + this.lucroTotal);
    }

    public void gerarRelatorio() {

        System.out.println("Teste relatório geral:");
        gerarRelatorioCustoTotal();
        gerarRelatorioLucroTotal();
        gerarRelatorioVendaTotal();
    }

    public void adicionarCusto(double custo) {
        this.custoTotal += custo;
    }

    public void adicionarVenda(double venda) {
        this.vendaTotal += venda;
    }
}
