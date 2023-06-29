package interface_segregation;

public class ExemploBom {

    interface Trabalha {
        void trabalhar();
    }

    interface Come {
        void comer();
    }

    interface Dorme {
        void dormir();
    }

    class Humano implements Trabalha, Come, Dorme {
        @Override
        public void trabalhar() {
            // código para trabalhar
        }
        @Override
        public void comer() {
            // código para comer
        }
        @Override
        public void dormir() {
            // código para dormir
        }
    }

}
