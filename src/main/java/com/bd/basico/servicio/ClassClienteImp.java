package com.bd.basico.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.basico.modelo.TblCliente;
import com.bd.basico.repositorio.IClienteRepositorio;

@Service
public class ClassClienteImp implements IClienteServicio{
	
	//aplicamos la inyeccion de dependencias
	@Autowired
	private IClienteRepositorio iclienterepository;

	@Override
	public List<TblCliente> ListadoClientes() {
		// Devuelve el listado
		return (List<TblCliente>)iclienterepository.findAll();
		
	}

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		iclienterepository.save(cliente);
	}

	@Override
	public TblCliente BuscarporId(Integer id) {
		// buscar por codigo, si no encuentra devuelve nulo
		return iclienterepository.findById(id).orElse(null);
		
	}

	@Override
	public void Eliminar(Integer id) {
		//Eliminar por codigo
		iclienterepository.deleteById(id);
		
	}

	

}//fin de la clase
