package tarefa;

/**
 * Classe Lampada representa uma lâmpada comum em uma casa.
 * Ela possui características como estado (ligada ou desligada) e intensidade da luz.
 * @author wosley arruda
 */
public class Lampada {

    // Propriedades da Lâmpada
    private boolean ligada;
    private int intensidade; // Representa a intensidade da luz (0 a 100)

    // Construtor
    public Lampada() {
        this.ligada = false; // Lâmpada começa desligada
        this.intensidade = 0; // Intensidade inicial
    }

    // Método para ligar a lâmpada
    public void ligar() {
        ligada = true;
        intensidade = 50; // Define uma intensidade padrão ao ligar
    }

    // Método para desligar a lâmpada
    public void desligar() {
        ligada = false;
        intensidade = 0;
    }

    // Método para ajustar a intensidade da luz
    public void ajustarIntensidade(int novaIntensidade) {
        if (novaIntensidade >= 0 && novaIntensidade <= 100) {
            intensidade = novaIntensidade;
        }
    }

    // Método para obter o estado da lâmpada
    public boolean isLigada() {
        return ligada;
    }

    // Método para obter a intensidade da luz
    public int getIntensidade() {
        return intensidade;
    }

    // Método toString para exibir informações da lâmpada
    @Override
    public String toString() {
        return "Lampada{" +
                "ligada=" + ligada +
                ", intensidade=" + intensidade +
                '}';
    }
}

