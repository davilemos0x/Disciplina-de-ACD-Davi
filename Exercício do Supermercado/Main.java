import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int opt=0;
        int codigoproduto=20;

        Cliente NovoCliente = new Cliente();
        Pedido NovoPedido = new Pedido();

        Produto[] produtos = new Produto[4];
        produtos[0] = new Produto();
        produtos[1] = new Produto();
        produtos[2] = new Produto();
        produtos[3] = new Produto();

        produtos[0].setDescricao(descricao.ARROZ);
        produtos[1].setDescricao(descricao.FEIJÃO);
        produtos[2].setDescricao(descricao.FARINHA);
        produtos[3].setDescricao(descricao.LEITE);

        produtos[0].setQuantidadeEstoque(100);
        produtos[1].setQuantidadeEstoque(100);
        produtos[2].setQuantidadeEstoque(100);
        produtos[3].setQuantidadeEstoque(100);

        produtos[0].setPreco(10.50);
        produtos[1].setPreco(6.75);
        produtos[2].setPreco(4.99);
        produtos[3].setPreco(4.19);

        Item item = new Item();

        System.out.println("Bem-vindo ao sistema do mercado!");
        do {
            System.out.println("Escolha uma das opções abaixo\n[1] - Nova Venda\n[2] - Realizar Pagamento\n[0] - Encerrar programa\n");
            opt = leitura.nextInt();
            leitura.nextLine();

            switch(opt){
                case 1:
                    System.out.println("Insira o Nome do Cliente: ");
                    NovoCliente.setNome(leitura.nextLine());
                    System.out.println("Insira o CPF do Cliente: ");
                    NovoCliente.setCPF(leitura.nextLine());
                    do{
                        System.out.println("Insira o código do produto que deseja vender:\n[0] - ARROZ\n[1] - FEIJÃO\n[2] - FARINHA\n[3] - LEITE\n[4] - Fechar carrinho\n");
                        codigoproduto = leitura.nextInt();

                        if(codigoproduto!=0&&codigoproduto!=1&&codigoproduto!=2&&codigoproduto!=3&&codigoproduto!=4) {
                            System.out.println("Código inválido\n");
                            break;
                        } else if (codigoproduto == 4) {
                            break;
                        }

                        System.out.println("Insira a quantidade desse produto: ");
                        item.setQuantidade(leitura.nextInt());
                        leitura.nextLine();
                        NovoPedido.setValorPedido((float) ((float) NovoPedido.getValorPedido()+(item.getQuantidade() * produtos[codigoproduto].getPreco())));
                        produtos[codigoproduto].setQuantidadeEstoque(produtos[codigoproduto].getQuantidadeEstoque()-item.getQuantidade());
                    }while(codigoproduto!=4);
                    break;
                case 2:
                    System.out.println("O total do pedido é R$ " + NovoPedido.getValorPedido());
                    System.out.println("Insira o código do método de pagamento correspondente:\n[0] - DINHEIRO\n[1] - CHEQUE\n[2] - CARTÃO\n");
                    opt = leitura.nextInt();
                    leitura.nextLine();
                    switch(opt){
                        case 0:
                            NovoPedido.setPagamento(TipoPagamento.valueOf("DINHEIRO"));
                            break;
                        case 1:
                            NovoPedido.setPagamento(TipoPagamento.valueOf("CHEQUE"));
                            break;
                        case 2:
                            NovoPedido.setPagamento(TipoPagamento.valueOf("CARTÃO"));
                            break;
                    }
                    System.out.println("Pagamento concluído! Pedido feito com sucesso!");
                    NovoPedido.setValorPedido(0.0F);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opt !=0);

        leitura.close();
    }
}
