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
import pe.gob.midis.dgfo.dof.entity.Viceministerio;

@Generated("com.mysema.query.codegen.EntitySerializer")
public class QViceministerio extends EntityPathBase<Viceministerio> {

    private static final long serialVersionUID = 1056789151L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QViceministerio viceministerio = new QViceministerio("viceministerio");

    public final StringPath descripcionViceMinisterio = createString("descripcionViceMinisterio");

    public final ListPath<Direccion, QDireccion> direccions = this.<Direccion, QDireccion>createList("direccions", Direccion.class, QDireccion.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idViceMinisterio = createNumber("idViceMinisterio", Integer.class);

    public final QInstitucion institucion;

    public QViceministerio(String variable) {
        this(Viceministerio.class, forVariable(variable), INITS);
    }

    public QViceministerio(Path<? extends Viceministerio> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QViceministerio(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QViceministerio(PathMetadata<?> metadata, PathInits inits) {
        this(Viceministerio.class, metadata, inits);
    }

    public QViceministerio(Class<? extends Viceministerio> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
    }

}
