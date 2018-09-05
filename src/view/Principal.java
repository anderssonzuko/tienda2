package view;
import java.util.Scanner;

import com.Categoria.control.Categorias;
import com.Categoria.entity.Categoria;
import com.Categoria.view.CategoriaView;
import com.Producto.control.Productos;
import com.Producto.view.ProductoView;

public class Principal {

	private static Categorias categorias;
	private static Productos productos;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		CategoriaView categoriaView = new CategoriaView(10, scanner, categorias, productos);
		com.Categoria.view.Menu.menuCategorias(scanner, categoriaView);
		ProductoView productosView = new ProductoView(10, scanner,categoriaView.getCategorias());
		
		com.Producto.view.Menu.menu(scanner, productosView);
		scanner.close();
	}

}
