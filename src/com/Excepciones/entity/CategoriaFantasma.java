package com.Excepciones.entity;

public class CategoriaFantasma extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CategoriaFantasma() {
		System.out.println("No existe la categoria seleccionada");
	}

	
}
