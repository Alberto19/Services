package Promocoes.Controller;



import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Promocoes.Domain.Pacote;
import Promocoes.Service.PacoteService;

//Informa ao Spring que sera uma Controller REST
@RestController
//Informa o mapeamento dos endpoints para os metodos da classe
@RequestMapping(value = "/api/v1/pacotes", produces = MediaType.APPLICATION_JSON_VALUE)
public class PacoteController {

	@Autowired
	private PacoteService service;
	
	@RequestMapping(value = "/{codigo}", method = RequestMethod.GET)
	public Pacote get(@PathVariable Long codigo) {
		return service.findbyCodigo(codigo);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Pacote> getAll() {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pacote create(@RequestBody Pacote pacote) {
		return service.create(pacote);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pacote update(@RequestBody Pacote pacote) {
		return service.update(pacote);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void delete(Long codigo) {
		Pacote pacote = service.findbyCodigo(codigo);	
		service.delete(pacote);
	}
	
}
