package dto;

import java.util.Locale;

//Version reducida de Auto para solo mostrar los atributos que pide: marca, combustible, valor y stock

public class AutoDTO {
    private String marca;
    private Combustible combustible;
    private double valor;
    private byte stock;
    private double valorTotal;

    public AutoDTO(String marca, Combustible combustible, double valor, byte stock) {
        this.marca = marca;
        this.combustible = combustible;
        this.valor = valor;
        this.stock = stock;
        this.valorTotal = valor * stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public byte getStock() {
        return stock;
    }

    public void setStock(byte stock) {
        this.stock = stock;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    public String toString() {
    	return marca + " -- " + combustible + " -- " + String.format(Locale.US, "%.1f", valor) + " -- " + stock + " -- " + String.format(Locale.US, "%.1f", valorTotal);

    }
}
