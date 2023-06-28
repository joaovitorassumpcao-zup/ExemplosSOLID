package liskov_substitution;

public class ExemploBom {

    abstract class Forma {
        public abstract int getArea();
    }

    class Retangulo extends Forma {
        protected int largura;
        protected int altura;

        @Override
        public int getArea() {
            return largura * altura;
        }
    }

    class Quadrado extends Forma {
        protected int lado;

        @Override
        public int getArea() {
            return lado * lado;
        }
    }

}
