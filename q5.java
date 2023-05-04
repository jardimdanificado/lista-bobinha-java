public abstract class Esporte {
    private String nome;
    private int numJogadores;
    private int tempoJogo;

    public Esporte(String nome, int numJogadores, int tempoJogo) {
        this.nome = nome;
        this.numJogadores = numJogadores;
        this.tempoJogo = tempoJogo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public int getTempoJogo() {
        return tempoJogo;
    }

    public abstract void iniciarPartida();
}

public class Futebol extends Esporte {
    private int numGols;

    public Futebol(String nome, int numJogadores, int tempoJogo) {
        super(nome, numJogadores, tempoJogo);
        this.numGols = 0;
    }

    public void fazerGol() {
        numGols++;
    }

    public int getNumGols() {
        return numGols;
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando partida de futebol...");
    }
}

public class Basquete extends Esporte {
    private int numCestas;

    public Basquete(String nome, int numJogadores, int tempoJogo) {
        super(nome, numJogadores, tempoJogo);
        this.numCestas = 0;
    }

    public void fazerCesta() {
        numCestas++;
    }

    public int getNumCestas() {
        return numCestas;
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando partida de basquete...");
    }
}

public class Volei extends Esporte {
    private int numPontos;

    public Volei(String nome, int numJogadores, int tempoJogo) {
        super(nome, numJogadores, tempoJogo);
        this.numPontos = 0;
    }

    public void fazerPonto() {
        numPontos++;
    }

    public int getNumPontos() {
        return numPontos;
    }

    @Override
    public void iniciarPartida() {
        System.out.println("Iniciando partida de vôlei...");
    }
}
