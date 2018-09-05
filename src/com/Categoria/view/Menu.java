package com.Categoria.view;

import java.util.Scanner;

import com.Excepciones.entity.CategoriaFantasma;

import view.InputTypes;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int encabezadoCategorias (Scanner scanner) {
		int opcion;
		while (true) {
			System.out.println("Ingrese una opcion ");
			System.out.println("------------------");
			System.out.println("1. Ingresar Categoria ");
			System.out.println("2. Lista de Categorias ");
			System.out.println("3. Eliminar Categoria ");
			System.out.println("0. Salir");
			
			opcion = InputTypes.readInt("Su opcion: ", scanner);
			
			if (opcion >= 0 && opcion <=3) {
				return opcion;
			}
		}
	}
	
	public static void menuCategorias (Scanner scanner, CategoriaView categoriaView) {
		boolean salir = false;
		
		while(!salir) {
			
			switch (encabezadoCategorias(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categoriaView.add();
				break;
			case 2:
				categoriaView.List();
				break;
			case 3:
				try {
					categoriaView.delete();
				} catch (CategoriaFantasma e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			
		}
	}
}
