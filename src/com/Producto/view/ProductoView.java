package com.Producto.view;

import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.view.Menu;
import com.Excepciones.entity.CategoriaFantasma;
import com.Producto.control.Productos;
import com.Producto.entity.Producto;

import view.InputTypes;

public class ProductoView {

	private Productos productos;
	private Categorias categorias;
	private Scanner scanner;
	
	public ProductoView (int n, Scanner scanner, Categorias categorias) {
	
		productos = new Productos(n);
		this.scanner = scanner;
		this.categorias = categorias;
	}
	
	public void add() throws CategoriaFantasma{
		Producto producto;
		producto = RegistroProducto.ingresar(scanner, categorias);
		productos.ingresar (producto);
	}
	
	public void List() {
		int codCategoria = 0;
		int indiceCategoria = 0;
		for(int i=0 ; i < productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategoria=productos.getProductos()[i].getCodCategoria();
			indiceCategoria = categorias.buscar(codCategoria);
			System.out.println(categorias.getCategorias()[indiceCategoria]);
		}
	}
	
	public void delete() {
		int codProducto = InputTypes.readInt("Ingrese codigo del produto a eliminar ", scanner);
		productos.eliminar(codProducto);
	}
}
