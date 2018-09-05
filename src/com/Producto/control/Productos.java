package com.Producto.control;

import com.Categoria.control.Categorias;
import com.Producto.entity.Producto;

public class Productos {

	private  Producto [] productos;
	private int cantidad;
	private int ultimo;
	
	public Productos (int tamaño) {
		productos = new Producto[tamaño];
		cantidad = 0;
		ultimo = -1;
	}
	
	public void ingresar(Producto producto) throws java.lang.ArrayIndexOutOfBoundsException {
		productos[++ultimo] = producto;
		cantidad++;
	}
	
	public void eliminar(int codProducto) {
		int indice = buscar(codProducto);
		
		if (indice >= 0) {
			if(indice != ultimo) {
				for(int i=indice; i<=ultimo; i++) {
					// Recorrer todos los elementos a partir de 1
					productos[i]= productos[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}
	}
	
	private int buscar(int codProducto) {
		int indice = -1;
		int i = 0;
		
		while ( i <= ultimo) {
			if (codProducto == productos[i].getCodProducto()) {
				indice = i;
				break;
			}
			i++;
		}
		return indice;	
	}

	public int getCantidad() {
		return cantidad;
	}

	public Producto[] getProductos() {
		return productos;
	}
	
	
}
