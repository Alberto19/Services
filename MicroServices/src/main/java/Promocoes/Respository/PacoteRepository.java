package Promocoes.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Promocoes.Domain.Pacote;

@Repository
public interface PacoteRepository  extends CrudRepository<Pacote, Long>{

}
