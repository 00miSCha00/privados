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

import pe.gob.midis.dgfo.dof.entity.Direccion;
import pe.gob.midis.dgfo.dof.entity.Unidadnegocio;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDireccion extends EntityPathBase<Direccion> {

    private static final long serialVersionUID = 1504266961L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDireccion direccion = new QDireccion("direccion");

    public final StringPath descripcionDireccion = createString("descripcionDireccion");

    public final NumberPath<Integer> idDireccion = createNumber("idDireccion", Integer.class);

    public final QInstitucion institucion;

    public final ListPath<Unidadnegocio, QUnidadnegocio> unidadnegocios = this.<Unidadnegocio, QUnidadnegocio>createList("unidadnegocios", Unidadnegocio.class, QUnidadnegocio.class, PathInits.DIRECT2);

    public final QViceministerio viceministerio;

    public QDireccion(String variable) {
        this(Direccion.class, forVariable(variable), INITS);
    }

    public QDireccion(Path<? extends Direccion> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDireccion(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDireccion(PathMetadata<?> metadata, PathInits inits) {
        this(Direccion.class, metadata, inits);
    }

    public QDireccion(Class<? extends Direccion> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
        this.viceministerio = inits.isInitialized("viceministerio") ? new QViceministerio(forProperty("viceministerio"), inits.get("viceministerio")) : null;
    }

}

