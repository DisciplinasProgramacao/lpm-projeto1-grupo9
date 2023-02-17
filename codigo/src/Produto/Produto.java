package Produto;

/* Definições
- Cada produto vendido tem uma descrição de pelo menos 3 caracteres; <- apenas os vendidos ?
- Um  produto  tem  um  preço  de  custo  e  um  preço  de  venda.  O  preço  de  venda  é  assim 
calculado:
preço de custo + margem de lucro + valor dos impostos
- A margem de lucro de um produto
- O valor dos impostos é de 18% sobre a soma do custo e da margem de lucro.
- Devem ser registradas quantidades e valores arrecadados com as vendas de um produto.
- Devem ser registradas as quantidades e os custos com a aquisição de um produto.
- Um produto deve ser monitorado para saber se sua quantidade atual em estoque está abaixo 
do mínimo necessário para funcionamento da mercearia. 
*/

public class Produto {
    private static final double IMPOSTO = 0.18;

    private int quantidadeMinima;
    private int quantidadeAtual = 0;

    private int quantidadeComprada = 0;
    private int quantidadeVendida = 0;

    private double custoTotal = 0;
    private double vendaTotal = 0;

    private double Custo; // valor de compra
    private double Venda; // valor de venda
    private double Lucro; // margem de lucro
    private String descricao; // descricao de produto

    public Produto(){}
    
    public Produto(int quantidadeMinima, double Custo, double Lucro, String descricao){
        // Cada produto vendido tem uma descrição de pelo menos 3 caracteres
        // if(descricao.length() < 3) {
        //     System.out.println("Descrição curta demais");
        //     System.exit(0);
        // }
        this.quantidadeMinima = quantidadeMinima;
        this.Custo = Custo;
        this.Lucro = Lucro;
        this.descricao = descricao;
        calculaVenda();
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public double getVendaTotal() {
        return vendaTotal;
    }

    // A margem de lucro de um produto sempre é entre 30 e 80% do valor do preço de custo.
    private boolean validaLucro(){
        return this.Lucro >= 1.3 && this.Lucro <= 1.8;
    }
    
    //  Um  produto  tem  um  preço  de  custo  e  um  preço  de  venda.  O  preço  de  venda  é  assim 
    // calculado: preço de custo + margem de lucro + valor dos impostos => o valor dos impostos
    //  é de 18% sobre a soma do custo e da margem de lucro.
    private void calculaVenda(){
        validaLucro();
        this.Venda = (1 + IMPOSTO) * (Custo * Lucro);
    }

    public void adicionaQuantidade(int quantidade) {
        this.quantidadeAtual += quantidade;
        this.custoTotal += this.Custo * quantidade;
        this.quantidadeComprada += quantidade;
    }

    public void removeQuantidade(int quantidade) {
        this.quantidadeAtual -= quantidade;
        this.vendaTotal += this.Venda * quantidade;
        this.quantidadeVendida += quantidade;
    }
}
