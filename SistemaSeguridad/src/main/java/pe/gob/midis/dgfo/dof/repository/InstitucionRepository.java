package pe.gob.midis.dgfo.dof.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import pe.gob.midis.dgfo.dof.entity.Institucion;

public interface InstitucionRepository extends
        CrudRepository<Institucion, Long>,
        QueryDslPredicateExecutor<Institucion> {
    
}
