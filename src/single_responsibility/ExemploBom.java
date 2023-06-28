package single_responsibility;

public class ExemploBom {

    class Empregado {
        public void salvarEmpregado(Empregado empregado) {
            // código que salva o empregado na base de dados
        }
    }

    class CalculadoraSalario {
        public void calcularSalario(Empregado empregado) {
            // código que calcula o salário do empregado
        }
    }

}
