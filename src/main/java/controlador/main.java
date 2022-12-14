package controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.*;
public class main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
				//CONSTANTES
				final String HOST = variablesConexionPostgreSQL.getHost();
				final String PORT = variablesConexionPostgreSQL.getPort();
				final String DB = variablesConexionPostgreSQL.getDb();
				final String USER = variablesConexionPostgreSQL.getUser();
				final String PASS = variablesConexionPostgreSQL.getPass();
				ArrayList<ProductoDTO> listProductos = new ArrayList<>();

				/*Se crea una instancia de la clase en la que estamos para poder generar la conexión a PostgreSQL
				*utilizando el método generaConexion
				*/
				
				System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Lamada generaConexion");
				ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
				
				Connection conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
				if(conexionGenerada != null) {
					//Primera prueba, si no es null, me printa que no lo es
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Conexion done");
				}
				else {
					System.out.println("[INFORMACIÓN-controladorPortgreSQL-main] Conexion ha pinchao");
				}
				
				try {
					conexionGenerada.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				conexionGenerada = conexionPostgresql.generaConexion(HOST,PORT,DB,USER,PASS);
				ResultSet resultadoconsulta = modelo.ConsultasSQL.selectAllProductos(conexionGenerada);
				
				listProductos = modelo.ProductoADTO.resultsetProducto(resultadoconsulta);
				
				System.out.println(listProductos.size());
				
				

	}

}
