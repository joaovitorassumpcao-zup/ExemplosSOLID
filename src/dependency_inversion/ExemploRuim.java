package dependency_inversion;

public class ExemploRuim {

    class ServicoPedidos {
        private BancoDados bancodados;

        public ServicoPedidos() {
            this.bancodados = new BancoDados();
        }

        public void salvarPedido(Pedido pedido) {
            bancodados.salvar(pedido);
        }
    }

}
