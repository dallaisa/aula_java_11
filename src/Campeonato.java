import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Campeonato {
    private List<Time> times;
    private List<Partida> partidas;

    public Campeonato() {
        times = new ArrayList<>();
        partidas = new ArrayList<>();
    }

    public void cadastrarTime(Time time) {
        times.add(time);
    }

    public void registrarPartida(Partida partida) {
        partidas.add(partida);
    }

    public void exibirClassificacao() {
        Collections.sort(times, (a, b) -> b.getPontos() - a.getPontos());
        System.out.println("\nClassificação:");
        for (Time t : times) {
            System.out.println(t);
        }
    }
}
