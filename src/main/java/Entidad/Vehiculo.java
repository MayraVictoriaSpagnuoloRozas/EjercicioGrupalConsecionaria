package Entidad;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private Integer stock;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, String color, Integer stock) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.stock = stock;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("VEHICULO (marca: %s, modelo: %s, color: %s, stock: %s)",
                marca, modelo, color, stock);
    }
}
