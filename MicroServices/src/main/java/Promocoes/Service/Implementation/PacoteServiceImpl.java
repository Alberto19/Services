package Promocoes.Service.Implementation;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Promocoes.Domain.Pacote;
import Promocoes.Respository.PacoteRepository;
import Promocoes.Service.PacoteService;

@Service
public class PacoteServiceImpl implements PacoteService{

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
