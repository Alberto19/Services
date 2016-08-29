package Promocoes.Service;

import java.util.Collection;

import Promocoes.Domain.Pacote;

public interface PacoteService {

	Pacote findbyCodigo(Long codigo);
	Collection<Pacote> findAll();
	Pacote create(Pacote pacote);
	Pacote update(Pacote pacote);
	void delete(Pacote pacote);
	
}
