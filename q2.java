public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double preco;

    public Veiculo(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public abstract double calcularValorSeguro();

    public abstract double calcularImposto();
}

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, double preco, int numPortas) {
        super(marca, modelo, preco);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return getPreco() * 0.05;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.1;
    }
}

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, double preco, int cilindradas) {
        super(marca, modelo, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularValorSeguro() {
        return getPreco() * 0.03;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.05;
    }
}

public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, double preco, int capacidadeCarga) {
        super(marca, modelo, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public double calcularValorSeguro() {
        return getPreco() * 0.1;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.15;
    }
}

public class LojaDeVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fiat", "Uno", 20000, 4);
        Veiculo moto = new Moto("Honda", "CB300", 15000, 300);
        Veiculo caminhao = new Caminhao("Mercedes-Benz", "710", 80000, 10000);

        System.out.println("Valor do seguro do carro: " + carro.calcularValorSeguro());
        System.out.println("Imposto sobre o carro: " + carro.calcularImposto());

        System.out.println("Valor do seguro da moto: " + moto.calcularValorSeguro());
        System.out.println("Imposto sobre a moto: " + moto.calcularImposto());

        System.out.println("Valor do seguro do caminhão: " + caminhao.calcularValorSeguro());
        System.out.println("Imposto sobre o caminhão: " + caminhao.calcularImposto());
    }
}
