package com.Categoria.control;

import com.Categoria.entity.Categoria;
import com.Excepciones.entity.CategoriaFantasma;

public class Categorias {

	private Categoria [] categorias; 
	private int cantidad;
	private int ultimo;
	
	public Categorias (int tamaño) {
		categorias = new Categoria[tamaño];
		cantidad = 0;
		ultimo = -1;
	}
	
	public void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias[++ultimo] = categoria;
		cantidad++;
	}
	
	public void eliminar(int codCategorias) throws CategoriaFantasma {
		int indice = buscar(codCategorias);
		searchBoolean(codCategorias);
		if (indice >= 0) {
			if(indice != ultimo) {
				for(int i=indice; i<=ultimo; i++) {
					categorias[i]= categorias[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}
	}
	
	public int buscar(int codProducto) {
		int indice = -1;
		int i = 0;
		
		while ( i <= ultimo) {
			if (codProducto == categorias[i].getCodCategoria()) {
				indice = i;
				break;
			}
			i++;
		}
		return indice;	
	}

	public Categoria[] getCategorias() {
		return categorias;
	}

	public int getCantidad() {
		return cantidad;
	}
	
	public boolean searchBoolean (int codCategoria) throws CategoriaFantasma {
		boolean valor = false;
		
		for(int i=0; i<= ultimo; i++) {
			if(codCategoria == categorias[i].getCodCategoria()) {
				valor = !valor;
			}
		}
		
		if (!valor) {
			throw new CategoriaFantasma();
		}
		return valor;
	}
	
	
}
