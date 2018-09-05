package com.Categoria.entity;

public class Categoria {

	private int codCategoria;
	private String nombreCategoria;
	private String descripcionCategoria;
	
	public Categoria(int codCategoria, String nombreCategoria, String descripcionCategoria) {
		super();
		this.codCategoria = codCategoria;
		this.nombreCategoria = nombreCategoria;
		this.descripcionCategoria = descripcionCategoria;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getDescripcionCategoria() {
		return descripcionCategoria;
	}

	public void setDescripcionCategoria(String descripcionCategoria) {
		this.descripcionCategoria = descripcionCategoria;
	}

	@Override
	public String toString() {
		return "Categoria [codCategoria=" + codCategoria + ", nombreCategoria=" + nombreCategoria
				+ ", descripcionCategoria=" + descripcionCategoria + "]";
	}
	
	
}
