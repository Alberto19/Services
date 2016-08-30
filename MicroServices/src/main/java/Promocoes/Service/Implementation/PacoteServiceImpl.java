package Promocoes.Service.Implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Promocoes.Domain.Pacote;
import Promocoes.Respository.PacoteRepository;
import Promocoes.Service.PacoteService;

//Informa ao Spring que um Objeto do Tipo PacoteServico dever ser criado no contexto da aplicacao
@Service
public class PacoteServiceImpl implements PacoteService{
	//Para que o Spring possa realizar a injecao de denpendencias
	@Autowired
	private PacoteRepository repository;
	
	public Pacote findbyCodigo(Long codigo) {
		return repository.findOne(codigo);
	}

	public Collection<Pacote> findAll() {
		return (Collection<Pacote> )repository.findAll();
	}

	public Pacote create(Pacote pacote) {
		return repository.save(pacote);
	}

	public Pacote update(Pacote pacote) {
		return repository.save(pacote);
	}

	public void delete(Pacote pacote) {
		repository.delete(pacote);	
	}

	
}
