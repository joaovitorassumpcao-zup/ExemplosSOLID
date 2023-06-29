package dependency_inversion;

public class ExemploBom {

    interface BancoDados {
        void salvar(Pedido pedido);
    }

    class ImplBancoDados implements BancoDados {
        public void salvar(Pedido pedido) {
            // código para salvar o pedido no banco de dados
        }
    }

    class ServicoPedidos {
        private BancoDados bancoDados;

        public ServicoPedidos(BancoDados bancoDados) {
            this.bancoDados = bancoDados;
        }

        public void salvarPedido(Pedido pedido) {
            bancoDados.salvar(pedido);
        }
    }

}
