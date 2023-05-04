public class Eletronico {
    private String marca;
    private String modelo;
    private double preco;
    private String descricao;

    public Eletronico(String marca, String modelo, double preco, String descricao) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

public class Computador extends Eletronico {
    private int memoriaRam;
    private int armazenamento;

    public Computador(String marca, String modelo, double preco, String descricao, int memoriaRam, int armazenamento) {
        super(marca, modelo, preco, descricao);
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}

public class Televisao extends Eletronico {
    private int polegadas;

    public Televisao(String marca, String modelo, double preco, String descricao, int polegadas) {
        super(marca, modelo, preco, descricao);
        this.polegadas = polegadas;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }
}

public class Smartphone extends Eletronico {
    private String sistemaOperacional;
    private int memoriaInterna;

    public Smartphone(String marca, String modelo, double preco, String descricao, String sistemaOperacional, int memoriaInterna) {
        super(marca, modelo, preco, descricao);
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaInterna = memoriaInterna;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(int memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }
}
