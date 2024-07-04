package com.bd.basico.repositorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bd.basico.modelo.*;

@Repository
public interface IClienteRepositorio extends CrudRepository<TblCliente,Integer>{
	

}//FIN DE LA INTERFACE
