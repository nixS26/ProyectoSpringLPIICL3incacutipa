package com.bd.basico.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.bd.basico.modelo.TblCliente;
import com.bd.basico.servicio.IClienteServicio;



@Controller
@RequestMapping("/vistas")
public class ClienteController {
		
	//inyeccion de dependencia...
			
			@Autowired
			private IClienteServicio iclienteservicio;
			//creamos el metodo listado..
			@GetMapping("/ListadoCliente")
			public String ListadoAuto(Model modelo) {
				//recuperamos el listado de autos..
				List<TblCliente> listado=iclienteservicio.ListadoClientes();
				for(TblCliente lis:listado) {
			System.out.println("codigo "+lis.getIdcliente()+" "+" nombre "+lis.getNombre());
				}
				//enviamos la data hacia la vista..
				modelo.addAttribute("listado",listado);
				//retornamos
				return "/vistas/ListadoCliente";

				

			}  //fin del metodo listado auto...

			

			//creamos los respectivos para metodos para registrar...

			@GetMapping("/FrmCrearCliente")

			public String RegistrarCliente(Model modelo) {

				//realizamos la respectiva instancia...
				TblCliente cliente=new TblCliente();
				//enviamos a la vista...
				modelo.addAttribute("regcliente",cliente);
				//retornamos
				return "/vistas/FrmCrearCliente";

				

			}  //fin del metodo registrar.

			

			//realizamos el mapeo con postmapping

			@PostMapping("/GuardarCliente")

			public String GuardarCliente(@ModelAttribute TblCliente  cliente,Model modelo) {
				iclienteservicio.RegistrarCliente(cliente);
				System.out.println("dato registrado en la bd");
				//retornamos al listado...
				return "redirect:/vistas/ListadoCliente";	
			}  //fin del metodo string...

			

			//*****************crearmos el metodo editar...

			@GetMapping("/editar/{id}")

			public String Editar(@PathVariable("id") Integer idcliente,Model modelo) {
				TblCliente cliente=iclienteservicio.BuscarporId(idcliente);
				//enviamos hacia la vista...
				modelo.addAttribute("regcliente",cliente);
				//retornamos el frmcrearcliente...
				return "/vistas/FrmCrearCliente";	
			}  //fin del metodo editar...
	
			@GetMapping("/eliminar/{id}")
			public String eliminar(@PathVariable("id") Integer idcliente,Model modelo) {

				//aplicamos inyeccion de dependencia...

				iclienteservicio.Eliminar(idcliente);
				//actulizar el listado
				List<TblCliente> listado=iclienteservicio.ListadoClientes();
				//enviamos a la vista
				modelo.addAttribute("listado",listado);
				//redireccionamos
				return "redirect:/vistas/ListadoCliente";		

			}   //fin del metodo eliminar...

	
			
}
