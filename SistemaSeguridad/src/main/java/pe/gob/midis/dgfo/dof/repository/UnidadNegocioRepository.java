package pe.gob.midis.dgfo.dof.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import pe.gob.midis.dgfo.dof.entity.UnidadNegocio;


public interface UnidadNegocioRepository extends
        CrudRepository<UnidadNegocio, Long>,
        QueryDslPredicateExecutor<UnidadNegocio> {
    
}
