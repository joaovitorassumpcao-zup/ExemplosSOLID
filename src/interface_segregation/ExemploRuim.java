package interface_segregation;

public class ExemploRuim {

    interface Trabalhador {
        void trabalhar();
        void comer();
        void dormir();
    }

    class Humano implements Trabalhador {
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
