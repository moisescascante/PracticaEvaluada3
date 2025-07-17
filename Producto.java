package superchinop3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author moisescascante
 */

public class Producto {
    private String codigoProducto;
    private String nombreProducto;
    private double precioBase;
    private int cantidad;
    private String tipoProducto;
    private double precioBruto;
    private double gananciaEsperada;

    public Producto(String codigoProducto, String nombreProducto, double precioBase, int cantidad, String tipoProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.tipoProducto = tipoProducto;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }

    private void calcularPrecioBruto() {
        switch (this.tipoProducto.toLowerCase()) {
            case "alimentos":
                this.precioBruto = this.precioBase * 1.20;
                break;
            case "bebidas":
                this.precioBruto = this.precioBase * 1.30;
                break;
            case "higiene":
                this.precioBruto = this.precioBase * 1.25 + 500; 
                break;
            case "limpieza":
                this.precioBruto = this.precioBase * 1.19 + this.precioBase * 0.04 + 1000 + this.precioBase;
                break;
            default:
                this.precioBruto = this.precioBase;
                break;
        }
    }

    private void calcularGananciaEsperada() {
        this.gananciaEsperada = (this.precioBruto - this.precioBase) * this.cantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularGananciaEsperada();
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
        calcularPrecioBruto();
        calcularGananciaEsperada();
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    @Override
    public String toString() {
        return "  Código: " + codigoProducto +
               ", Nombre: " + nombreProducto +
               ", Tipo: " + tipoProducto +
               ", Cantidad: " + cantidad +
               ", Precio Base: " + String.format("%.2f", precioBase) +
               ", Precio Bruto: " + String.format("%.2f", precioBruto) +
               ", Ganancia Esperada: " + String.format("%.2f", gananciaEsperada);
    }
}

