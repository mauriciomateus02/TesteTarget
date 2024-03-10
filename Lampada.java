public class Lampada {
    String interruptor;
    double ligada;

    public Lampada(String interruptor, double ligada) {
        this.interruptor = interruptor;
        this.ligada = ligada;
    }

    public void setInterruptor(String nome) {
        this.interruptor = nome;
    }
}
