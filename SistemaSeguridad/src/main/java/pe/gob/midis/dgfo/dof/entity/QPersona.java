package pe.gob.midis.dgfo.dof.entity;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;

import pe.gob.midis.dgfo.dof.entity.Persona;
import pe.gob.midis.dgfo.dof.entity.Personal;


/**
 * QPersona is a Querydsl query type for Persona
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersona extends EntityPathBase<Persona> {

    private static final long serialVersionUID = -2074754675L;

    public static final QPersona persona = new QPersona("persona");

    public final StringPath descripcionPersona = createString("descripcionPersona");

    public final NumberPath<Integer> idPersona = createNumber("idPersona", Integer.class);

    public final ListPath<Personal, QPersonal> personals = this.<Personal, QPersonal>createList("personals", Personal.class, QPersonal.class, PathInits.DIRECT2);

    public QPersona(String variable) {
        super(Persona.class, forVariable(variable));
    }

    public QPersona(Path<? extends Persona> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPersona(PathMetadata metadata) {
        super(Persona.class, metadata);
    }

}

