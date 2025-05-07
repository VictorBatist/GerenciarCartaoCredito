package victor.gerencia.model;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double preco;

    public Compra(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Compra{ descricao: " + descricao + " preco: " + preco + " }";
    }

    @Override
    public int compareTo(Compra outroCompra) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroCompra.preco));
    }
}
