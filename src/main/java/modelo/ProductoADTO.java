package modelo;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/** dtoADto - Métodos para convertir los ResultSet/Transacciones en DTOs.
 * @author garfe
 *
 */
public class ProductoADTO {
	public static ArrayList<ProductoDTO> resultsetAdtoAlumno(ResultSet resultadoConsulta){
		System.out.println("[INFORMACIÓN-resultsetAdtoAlumno-resultsetAdtoAlumno] Entrando en resultsetAdtoAlumno");
		ArrayList<ProductoDTO> listProductos = new ArrayList<>();
		//Leemos el resultado de la consulta hasta que no queden filas
		try {
			while ( resultadoConsulta.next() ) {
				listProductos.add(new ProductoDTO(resultadoConsulta.getString("md_uuid"), 
						resultadoConsulta.getInt("id_producto"),
						resultadoConsulta.getString("cod_producto"),
						resultadoConsulta.getString("nombre_producto"),
						resultadoConsulta.getString("tipo_producto_origen"),
						resultadoConsulta.getString("tipo_producto_clase"), 
						resultadoConsulta.getString("des_producto")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listProductos;
	}

}
