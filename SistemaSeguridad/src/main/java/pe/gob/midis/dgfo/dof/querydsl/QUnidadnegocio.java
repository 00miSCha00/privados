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

import pe.gob.midis.dgfo.dof.entity.Personal;
import pe.gob.midis.dgfo.dof.entity.Unidadnegocio;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUnidadnegocio extends EntityPathBase<Unidadnegocio> {

    private static final long serialVersionUID = 2128985140L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUnidadnegocio unidadnegocio = new QUnidadnegocio("unidadnegocio");

    public final StringPath descripcionUnidadNegocio = createString("descripcionUnidadNegocio");

    public final QDireccion direccion;

    public final NumberPath<Integer> idUnidadNegocio = createNumber("idUnidadNegocio", Integer.class);

    public final QInstitucion institucion;

    public final ListPath<Personal, QPersonal> personals = this.<Personal, QPersonal>createList("personals", Personal.class, QPersonal.class, PathInits.DIRECT2);

    public QUnidadnegocio(String variable) {
        this(Unidadnegocio.class, forVariable(variable), INITS);
    }

    public QUnidadnegocio(Path<? extends Unidadnegocio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnidadnegocio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUnidadnegocio(PathMetadata<?> metadata, PathInits inits) {
        this(Unidadnegocio.class, metadata, inits);
    }

    public QUnidadnegocio(Class<? extends Unidadnegocio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.direccion = inits.isInitialized("direccion") ? new QDireccion(forProperty("direccion"), inits.get("direccion")) : null;
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
    }

}

