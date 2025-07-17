/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchinop3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moisescascante
 */
public class Servicio {


public class InventarioService {
    private final Super superChino;
    private final Empleado empleadoActual;
    private List<Producto> productos; 
    private static final int MAX_PRODUCTOS = 100; 
    private int contadorProductos;

    public InventarioService(Super superChino, Empleado empleadoActual) {
        this.superChino = superChino;
        this.empleadoActual = empleadoActual;
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(String codigoProducto, String nombreProducto, double precioBase, int cantidad, String tipoProducto) {
    
        
        Producto nuevoProducto = new Producto(codigoProducto, nombreProducto, precioBase, cantidad, tipoProducto);
        productos.add(nuevoProducto);
        return true;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularGananciaTotalEsperada() {
        double gananciaTotal = 0;
        for (Producto producto : productos) {
                gananciaTotal += producto.getGananciaEsperada();
        }
        return gananciaTotal;
    }

    public Super getSuperChino() {
        return superChino;
    }

    public Empleado getEmpleadoActual() {
        return empleadoActual;
    }
}
    
}
