public class Pedido {
    private TipoPagamento pagamento;
    private float ValorPedido;

    public float getValorPedido() {
        return ValorPedido;
    }

    public void setValorPedido(float valorPedido) {
        ValorPedido = valorPedido;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }
}
