package com.Categoria.view;

import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Excepciones.entity.CategoriaFantasma;
import com.Producto.control.Productos;

import view.InputTypes;

public class CategoriaView {

	private Categorias categorias;
	private Scanner scanner;
	private Productos productos;
	
	public CategoriaView (int n, Scanner scanner, Categorias categorias, Productos productos) {
		
		categorias = new Categorias(n);
		this.scanner = scanner;
		this.categorias = categorias;
		this.productos = productos;
	}
	
	public Categorias getCategorias() {
		return categorias;
	}

	public void add() {
		Categoria categoria;
		
		categoria = RegistroCategoria.ingresar(scanner);
		categorias.ingresar(categoria);
	}
	
	public void List() {
		for(int i=0 ; i < categorias.getCantidad(); i++) {
			System.out.println(categorias.getCategorias()[i]);
		}
	}
	
	public void delete() throws CategoriaFantasma {
		int codCategoria = InputTypes.readInt("Ingrese codigo de la categoria a eliminar ", scanner);
		categorias.eliminar(codCategoria);
	}
}
