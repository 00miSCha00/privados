package pe.gob.midis.dgfo.dof.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import pe.gob.midis.dgfo.dof.entity.Modulo;


public interface ModuloRepository extends
        CrudRepository<Modulo, Long>,
        QueryDslPredicateExecutor<Modulo> {
    
}
