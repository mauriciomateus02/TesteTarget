public class Quest5 {
    public static void main(String[] args) {
        String nome = "abacaxi";

        char[] charNome = nome.toCharArray();
        char[] reverse = new char[nome.length()];

        for (int i = nome.length() - 1; i >= 0; i--) {
            reverse[(nome.length() - 1) - i] = charNome[i];
        }

        for (int i = 0; i <= nome.length() - 1; i++) {
            System.err.printf("%c ", reverse[i]);
        }
    }
}
