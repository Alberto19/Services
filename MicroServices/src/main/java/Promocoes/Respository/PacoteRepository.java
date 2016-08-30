package Promocoes.Respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import Promocoes.Domain.Pacote;
//Idica que sera um componente da camada de persistencia gerenciada pelo Spring
@Repository
public interface PacoteRepository  extends CrudRepository<Pacote, Long>{

}
