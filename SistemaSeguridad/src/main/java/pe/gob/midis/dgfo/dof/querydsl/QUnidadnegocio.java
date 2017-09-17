package pe.gob.midis.dgfo.dof.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;

import pe.gob.midis.dgfo.dof.entity.Personal;
import pe.gob.midis.dgfo.dof.entity.UnidadNegocio;


/**
 * QUnidadnegocio is a Querydsl query type for Unidadnegocio
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUnidadnegocio extends EntityPathBase<UnidadNegocio> {

    private static final long serialVersionUID = 2128985140L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUnidadnegocio unidadnegocio = new QUnidadnegocio("unidadnegocio");

    public final StringPath descripcionUnidadNegocio = createString("descripcionUnidadNegocio");

    public final QDireccion direccion;

    public final NumberPath<Integer> idUnidadNegocio = createNumber("idUnidadNegocio", Integer.class);

    public final QInstitucion institucion;

    public final ListPath<Personal, QPersonal> personals = this.<Personal, QPersonal>createList("personals", Personal.class, QPersonal.class, PathInits.DIRECT2);

    public QUnidadnegocio(String variable) {
        this(UnidadNegocio.class, forVariable(variable), INITS);
    }

    public QUnidadnegocio(Path<? extends UnidadNegocio> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUnidadnegocio(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUnidadnegocio(PathMetadata metadata, PathInits inits) {
        this(UnidadNegocio.class, metadata, inits);
    }

    public QUnidadnegocio(Class<? extends UnidadNegocio> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.direccion = inits.isInitialized("direccion") ? new QDireccion(forProperty("direccion"), inits.get("direccion")) : null;
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
    }

}

