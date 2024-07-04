package com.bd.basico.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_cliente")

public class TblCliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idcliente;

	private String apellido;

	private String dni;

	private String email;

	private String nacionalidad;

	private String nombre;

	private String sexo;

	private String tel;


	//CONSTRUCTOR VACIO
	public TblCliente() {

	}
	
	
@Override
	public String toString() {
		return "TblCliente [idcliente=" + idcliente + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email
				+ ", nacionalidad=" + nacionalidad + ", nombre=" + nombre + ", sexo=" + sexo + ", telf=" + tel+ "]";
	}//FIN DEL METODO TOSTRING


	public int getIdcliente() {

		return this.idcliente;

	}



	

	public void setIdcliente(int idcliente) {

		this.idcliente = idcliente;

	}



	public String getApellido() {

		return this.apellido;

	}



	public void setApellido(String apellido) {

		this.apellido = apellido;

	}



	public String getDni() {

		return this.dni;

	}



	public void setDni(String dni) {

		this.dni = dni;

	}



	public String getEmail() {

		return this.email;

	}



	public void setEmail(String email) {

		this.email = email;

	}



	public String getNacionalidad() {

		return this.nacionalidad;

	}



	public void setNacionalidad(String nacionalidad) {

		this.nacionalidad = nacionalidad;

	}



	public String getNombre() {

		return this.nombre;

	}



	public void setNombre(String nombre) {

		this.nombre = nombre;

	}



	public String getSexo() {

		return this.sexo;

	}



	public void setSexo(String sexo) {

		this.sexo = sexo;

	}



	public String getTel() {

		return this.tel;

	}



	public void setTel(String tel) {

		this.tel = tel;

	}

}//FIN DE LA CLASE
