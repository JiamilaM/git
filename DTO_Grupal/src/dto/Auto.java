package dto;

public class Auto {
	private int id;//porbando github
	private String marca;
	private String color;
	private String matricula;
	private String modelo;
	private int anio;
	private Combustible combustible;
	private double valor;
	private byte stock;
	public Auto(int id, String marca, String color, String matricula, String modelo, int anio, Combustible combustible,
			double valor, byte stock) {
		this.id = id;
		this.marca = marca;
		this.color = color;
		this.matricula = matricula;
		this.modelo = modelo;
		this.anio = anio;
		this.combustible = combustible;
		this.valor = valor;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
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
	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", color=" + color + ", matricula=" + matricula + ", modelo="
				+ modelo + ", anio=" + anio + ", combustible=" + combustible + ", valor=" + valor + ", stock=" + stock
				+ "]";
	}
	
	
	
	

}
