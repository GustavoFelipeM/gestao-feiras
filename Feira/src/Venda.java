public class Venda {
    private Produtor produtor;
    private Produto produto;
    private EdicaoFeira edicaoFeira;
    private int quantidade;
    private double valorTotal;
    private String observacoes;

    public double totalVendidoPorBanca(){
        return 0;
    }
    public void registrarFormaPagamento(){

    }
    public void aplicarPromocao(){

    }

    // Getters and setters
    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public EdicaoFeira getEdicaoFeira() {
        return edicaoFeira;
    }

    public void setEdicaoFeira(EdicaoFeira edicaoFeira) {
        this.edicaoFeira = edicaoFeira;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
