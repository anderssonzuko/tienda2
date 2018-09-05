package com.Producto.view;

import java.util.Scanner;

import com.Categoria.view.CategoriaView;
import com.Excepciones.entity.CategoriaFantasma;

import view.InputTypes;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int encabezado (Scanner scanner) {
		int opcion;
		
		while(true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("--------------------");
			System.out.println("1. Ingresar un produto ");
			System.out.println("2. Lista Productos ");
			System.out.println("3. Eliminar Produtos ");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("Su opcion : ", scanner);
			
			if (opcion >= 0 && opcion <=3) {
				return opcion;
			}
		}
	}
	
	public static void menu(Scanner scanner, ProductoView productoView) {
		boolean salir = false;
		
		while(!salir) {
			switch (encabezado(scanner)){
				case 0:
					salir = true;
					break;
				case 1:
				try {
					productoView.add();
				} catch (CategoriaFantasma e) {
					// TODO Auto-generated catch block
					System.out.println("No existe categoria");
					//e.printStackTrace();
				}
					break;
				case 2:
					productoView.List();
					break;
				case 3:
					productoView.delete();
					break;
			}
		}
	}

}
