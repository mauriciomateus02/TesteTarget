public class Interruptor {
    String nome;
    int ligada;

    public Interruptor(String nome, int ligada) {
        this.ligada = ligada;
        this.nome = nome;
    }

    public void setLigada(int ligada) {
        this.ligada = ligada;
    }

    public String getNome() {
        return nome;
    }
}
