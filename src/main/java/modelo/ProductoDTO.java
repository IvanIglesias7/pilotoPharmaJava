package modelo;

import java.sql.Date;

public class ProductoDTO {
	//Todas las propiedades
    String md_uuid;
    Date md_fch;
    int id_producto;
    String cod_producto;
    String nombre_producto;
    String tipo_producto_origen;
    String tipo_producto_clase;
    String des_producto;
    Date fch_alta_producto;
    String fch_baja_producto;
	public ProductoDTO(String md_uuid, int id_producto, String cod_producto, String nombre_producto,
			String tipo_producto_origen, String tipo_producto_clase, String des_producto) {
		super();
		this.md_uuid = md_uuid;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.tipo_producto_clase = tipo_producto_clase;
		this.des_producto = des_producto;
	}
	public String getMd_uuid() {
		return md_uuid;
	}
	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}
	public Date getMd_fch() {
		return md_fch;
	}
	public void setMd_fch(Date md_fch) {
		this.md_fch = md_fch;
	}
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public String getCod_producto() {
		return cod_producto;
	}
	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public void setTipo_producto_origen(String tipo_producto_origen) {
		this.tipo_producto_origen = tipo_producto_origen;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public void setTipo_producto_clase(String tipo_producto_clase) {
		this.tipo_producto_clase = tipo_producto_clase;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public void setDes_producto(String des_producto) {
		this.des_producto = des_producto;
	}
	public Date getFch_alta_producto() {
		return fch_alta_producto;
	}
	public void setFch_alta_producto(Date fch_alta_producto) {
		this.fch_alta_producto = fch_alta_producto;
	}
	public String getFch_baja_producto() {
		return fch_baja_producto;
	}
	public void setFch_baja_producto(String fch_baja_producto) {
		this.fch_baja_producto = fch_baja_producto;
	}
    
    
	
	
}
