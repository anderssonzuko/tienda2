package com.Producto.view;

import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Excepciones.entity.CategoriaFantasma;
import com.Producto.entity.Producto;

import view.InputTypes;

public class  RegistroProducto {

	public static Producto ingresar(Scanner scanner,Categorias categorias) throws CategoriaFantasma {
		
		int valor = -1;
		int codProducto = InputTypes.readInt("Ingrese el codigo del producto ", scanner);
		
		String nombreProducto = InputTypes.readString("Ingrese el nombre del producto ", scanner);
		
		double precio = InputTypes.readDouble("Ingrese el precio del producto ", scanner);
		
		String descripcion = InputTypes.readString("Ingrese la descripcion del producto ", scanner);
		
		int codCategoria = InputTypes.readInt("Ingrese la categoria del producto ", scanner);

		categorias.searchBoolean(codCategoria);
		return new Producto(codProducto, nombreProducto, precio, descripcion, codCategoria, codCategoria);
	}
}
