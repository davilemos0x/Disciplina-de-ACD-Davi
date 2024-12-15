public class Produto {
    private descricao Descricao;
    private Double Preco;
    private int QuantidadeEstoque;

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        QuantidadeEstoque = quantidadeEstoque;
    }

    public descricao getDescricao() {
        return Descricao;
    }

    public void setDescricao(descricao descricao) {
        Descricao = descricao;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }
}
