package modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasSQL {
	
	public static ResultSet selectAllProductos(Connection conexionGenerada) throws SQLException {
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllProductos] Entra en selectAllProductos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<ProductoDTO> ListaProducto = new ArrayList<ProductoDTO>();
		try {
			//Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"");
	}
		catch(Exception e) {
			conexionGenerada.close();
		}
		
		return resultadoConsulta;
		}

	
}

