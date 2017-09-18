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

import pe.gob.midis.dgfo.dof.entity.Direccion;
import pe.gob.midis.dgfo.dof.entity.UnidadNegocio;


/**
 * QDireccion is a Querydsl query type for Direccion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDireccion extends EntityPathBase<Direccion> {

    private static final long serialVersionUID = 1504266961L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDireccion direccion = new QDireccion("direccion");

    public final StringPath descripcionDireccion = createString("descripcionDireccion");

    public final NumberPath<Integer> idDireccion = createNumber("idDireccion", Integer.class);

    public final QInstitucion institucion;

    public final ListPath<UnidadNegocio, QUnidadNegocio> unidadnegocios = this.<UnidadNegocio, QUnidadNegocio>createList("unidadnegocios", UnidadNegocio.class, QUnidadNegocio.class, PathInits.DIRECT2);

    public final QViceMinisterio viceministerio;

    public QDireccion(String variable) {
        this(Direccion.class, forVariable(variable), INITS);
    }

    public QDireccion(Path<? extends Direccion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDireccion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDireccion(PathMetadata metadata, PathInits inits) {
        this(Direccion.class, metadata, inits);
    }

    public QDireccion(Class<? extends Direccion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
        this.viceministerio = inits.isInitialized("viceministerio") ? new QViceMinisterio(forProperty("viceministerio"), inits.get("viceministerio")) : null;
    }

}

