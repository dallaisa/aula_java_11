public class Main {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();

        Time time1 = new Time("Time Wicked", "California");
        time1.adicionarJogadora(new Jogadora("Taylor Swift", 22, "Atacante", 9));
        time1.adicionarJogadora(new Jogadora("Ariana Grande", 25, "Zagueira", 3));

        Time time2 = new Time("Time High School Musical", "New York");
        time2.adicionarJogadora(new Jogadora("Lady Gaga", 24, "Goleira", 1));
        time2.adicionarJogadora(new Jogadora("Rihanna", 20, "Meio-campo", 10));

        campeonato.cadastrarTime(time1);
        campeonato.cadastrarTime(time2);

        campeonato.registrarPartida(new Partida(time1, time2, 2, 1));
        campeonato.registrarPartida(new Partida(time1, time2, 0, 0));

        campeonato.exibirClassificacao();
    }
}
