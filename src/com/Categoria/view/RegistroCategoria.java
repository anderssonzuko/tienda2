package com.Categoria.view;

import java.util.Scanner;

import com.Categoria.entity.Categoria;

import view.InputTypes;

public class RegistroCategoria {

	public static Categoria ingresar(Scanner scanner) {
		int codCategoria = InputTypes.readInt("Ingrese el codigo de la categoria ", scanner);
		
		String nombreCategoria = InputTypes.readString("Ingrese el nombre de la categoria ", scanner);
		
		String descripcionCategoria = InputTypes.readString("Ingrese la descripcion de la categoria ", scanner);
		
		return new Categoria(codCategoria, nombreCategoria, descripcionCategoria);
	}
}
