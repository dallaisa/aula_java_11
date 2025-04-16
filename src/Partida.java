public class Partida {
    private Time timeA;
    private Time timeB;
    private int golsTimeA;
    private int golsTimeB;

    public Partida(Time timeA, Time timeB, int golsTimeA, int golsTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
        atualizarPontuacao();
    }

    private void atualizarPontuacao() {
        if (golsTimeA > golsTimeB) {
            timeA.adicionarPontos(3);
        } else if (golsTimeB > golsTimeA) {
            timeB.adicionarPontos(3);
        } else {
            timeA.adicionarPontos(1);
            timeB.adicionarPontos(1);
        }
    }

    @Override
    public String toString() {
        return timeA.getNome() + " " + golsTimeA + " x " + golsTimeB + " " + timeB.getNome();
    }
}
