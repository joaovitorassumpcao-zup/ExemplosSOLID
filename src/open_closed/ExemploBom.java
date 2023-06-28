package open_closed;

public class ExemploBom {

    interface Forma {
        void desenhar();
    }

    class Circulo implements Forma {
        @Override
        public void desenhar() {
            // código para desenhar um círculo
        }
    }

    class Retangulo implements Forma {
        @Override
        public void desenhar() {
            // código para desenhar um retangulo
        }
    }
}
