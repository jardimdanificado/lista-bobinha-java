public abstract class Animal {
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract String som();
}


public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String especie, String tipoPelo) {
        super(nome, idade, especie);
        this.tipoPelo = tipoPelo;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    @Override
    public String som() {
        return "Som de mamífero";
    }
}


public class Ave extends Animal {
    private String corPena;

    public Ave(String nome, int idade, String especie, String corPena) {
        super(nome, idade, especie);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }


    @Override
    public String som() {
        return "Som de ave";
    }
}

public class Reptil extends Animal {
    private boolean venenoso;

    public Reptil(String nome, int idade, String especie, boolean venenoso) {
        super(nome, idade, especie);
        this.venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    @Override
    public String som() {
        return "Som de réptil";
    }
}
