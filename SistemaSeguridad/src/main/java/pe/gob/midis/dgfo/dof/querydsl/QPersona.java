package pe.gob.midis.dgfo.dof.querydsl;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.ListPath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;

import pe.gob.midis.dgfo.dof.entity.Persona;
import pe.gob.midis.dgfo.dof.entity.Personal;


@Generated("com.mysema.query.codegen.EntitySerializer")
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

    public QPersona(PathMetadata<?> metadata) {
        super(Persona.class, metadata);
    }

}

