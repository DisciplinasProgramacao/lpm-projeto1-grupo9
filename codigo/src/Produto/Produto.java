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

    private double Custo; // valor de compra
    private double Venda; // valor de venda
    private double Lucro; // margem de lucro
    private String descricao; // descricao de produto

    public Produto(){}
    
    public Produto(int quantidadeMinima, double Custo, double Lucro, String descricao) {
        this.quantidadeMinima = quantidadeMinima;
        this.Custo = Custo;
        this.Lucro = Lucro;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCusto() {
        return Custo;
    }

    public double getVenda() {
        calcValorDeVenda();
        return Venda;
    }

    public double getLucro() {
        return Lucro;
    }

    public void setLucro(double Lucro) {
        this.Lucro = Lucro;
    }
    
    private void calcValorDeVenda(){
        validaLucro();
        this.Venda = (1 + IMPOSTO) * (Custo * Lucro);
    }

    private boolean validaLucro(){
       return this.Lucro >= 1.3 && this.Lucro <= 1.8;
    }

    public void adicionaProduto(int quantidade) {
        this.quantidadeAtual += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidadeAtual -= quantidade;
    }

    public void verificarQuantidade(){
        if(quantidadeAtual < quantidadeMinima) {
            System.out.println("O estoque está abaixo do mínimo para o funcionamento do estabelecimento");
        } else {
            System.out.println("O estabelecimento pode funcionar normalmente");
        }
        System.out.println("Quantidade atual:" + quantidadeAtual + "\nQuantidade mínima:" + quantidadeMinima);
    }
}
