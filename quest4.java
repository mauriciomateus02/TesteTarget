import java.util.*;

public class quest4 {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada("", 0);
        Lampada lampada2 = new Lampada("", 0);
        Lampada lampada3 = new Lampada("", 0);

        Interruptor interruptor1 = new Interruptor("interruptor1", 0);
        Interruptor interruptor2 = new Interruptor("interruptor2", 0);
        Interruptor interruptor3 = new Interruptor("interruptor3", 0);

        ligar(interruptor1, lampada2);
        desligar(interruptor1, lampada2);
        ligar(interruptor2, lampada3);

        irSala(interruptor2, interruptor1, lampada1, lampada2, lampada3);

        desligar(interruptor2, lampada3);
        ligar(interruptor3, lampada1);

        irSala(interruptor3, interruptor2, lampada1, lampada2, lampada3);

        System.out.println("Lampada 1: " + lampada1.interruptor);
        System.out.println("Lampada 2: " + lampada2.interruptor);
        System.out.println("Lampada 3: " + lampada3.interruptor);

    }

    static void ligar(Interruptor interruptor, Lampada luz) {
        interruptor.ligada = 1;
        luz.ligada = 1;
    }

    static void desligar(Interruptor interruptor, Lampada luz) {
        interruptor.ligada = 0;
        luz.ligada = 0.25;
    }

    static void irSala(Interruptor luzLigada, Interruptor LuzDesligada, Lampada lampada1, Lampada lampada2,
            Lampada lampada3) {
        if (lampada1.ligada > 0 && lampada1.ligada < 1) {
            if (lampada1.interruptor.isEmpty())
                lampada1.setInterruptor(LuzDesligada.getNome());
        }
        if (lampada2.ligada > 0 && lampada2.ligada < 1) {

            if (lampada2.interruptor.isEmpty())
                lampada2.setInterruptor(LuzDesligada.getNome());
        }
        if (lampada3.ligada > 0 && lampada3.ligada < 1) {
            if (lampada3.interruptor.isEmpty())
                lampada3.setInterruptor(LuzDesligada.getNome());
        }
        if (lampada1.ligada == 1.0) {
            lampada1.setInterruptor(luzLigada.getNome());
        }
        if (lampada2.ligada == 1.0) {
            lampada2.setInterruptor(luzLigada.getNome());
        }
        if (lampada3.ligada == 1.0) {
            lampada3.setInterruptor(luzLigada.getNome());
        }

    }

}
