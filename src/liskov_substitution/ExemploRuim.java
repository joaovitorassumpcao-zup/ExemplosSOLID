package liskov_substitution;

public class ExemploRuim {

    class Retangulo {
        protected int largura;
        protected int altura;


        public void setLargura(int largura) {
            this.largura = largura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int getArea() {
            return largura * altura;
        }
    }

    class Quadrado extends Retangulo {
        @Override
        public void setLargura(int largura) {
            this.largura = largura;
            this.altura = largura;
        }

        @Override
        public void setAltura(int altura) {
            this.largura = altura;
            this.altura = altura;
        }
    }

}
