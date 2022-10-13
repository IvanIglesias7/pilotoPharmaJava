package modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultasSQL {
	public static ArrayList<ProductoDTO> selectAllProductos(Connection conexionGenerada) {
		System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllAlumnos] Entra en selectAllAlumnos");
		Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ArrayList<ProductoDTO> listProductos = new ArrayList<>();
		try {
			//Se abre una declaración
			declaracionSQL = conexionGenerada.createStatement();
			//Se define la consulta de la declaración y se ejecuta
			resultadoConsulta = declaracionSQL.executeQuery("INSERT INTO \"dlk_operacional_productos\".\"opr_cat_productos\"("
					+ "	md_uuid, md_fch, id_producto, cod_producto, nombre_producto, tipo_producto_origen, tipo_producto_clase, des_producto, fch_alta_producto, fch_baja_producto)"
					+ "	VALUES ('adf131029022fch12345', 2022-10-13, DEFAULT,"
					+ "			'hig_p_gelf_f', 'Gel de aceite de fresa, Farlane.',"
					+ "			'Propio', 'Higiene', 'Gel de aceite de fresa producido por marca propia Farlane',\r\n"
					+ "			2022-10-13, 9999-12-31);");
		    
			//Llamada a la conversión a dtoProducto
			listProductos = ProductoADTO.resultsetAdtoAlumno(resultadoConsulta);
			int i = listProductos.size();
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllAlumnos] Número alumnos: "+i);
			System.out.println("[INFORMACIÓN-consultasPostgreSQL-selectAllAlumnos] Cierre conexión, declaración y resultado");				
		    resultadoConsulta.close();
		    declaracionSQL.close();
		    conexionGenerada.close();
		} catch (SQLException e) {
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			return listProductos;
		}
		return listProductos;
	}

}
