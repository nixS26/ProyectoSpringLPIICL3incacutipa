package com.bd.basico.servicio;

import java.util.List;

import com.bd.basico.modelo.TblCliente;

public interface IClienteServicio {

	public List<TblCliente> ListadoClientes();
	public void RegistrarCliente(TblCliente cliente);
	public TblCliente BuscarporId(Integer id);
	public void Eliminar(Integer id);
}//fin de la interface
