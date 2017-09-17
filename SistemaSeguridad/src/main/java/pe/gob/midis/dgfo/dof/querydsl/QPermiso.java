package pe.gob.midis.dgfo.dof.querydsl;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;

import pe.gob.midis.dgfo.dof.entity.Permiso;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPermiso extends EntityPathBase<Permiso> {

    private static final long serialVersionUID = -2074939018L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPermiso permiso = new QPermiso("permiso");

    public final NumberPath<Integer> activo = createNumber("activo", Integer.class);

    public final NumberPath<Integer> idPermiso = createNumber("idPermiso", Integer.class);

    public final QOpcion opcion;

    public final QRol rol;

    public QPermiso(String variable) {
        this(Permiso.class, forVariable(variable), INITS);
    }

    public QPermiso(Path<? extends Permiso> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPermiso(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPermiso(PathMetadata<?> metadata, PathInits inits) {
        this(Permiso.class, metadata, inits);
    }

    public QPermiso(Class<? extends Permiso> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.opcion = inits.isInitialized("opcion") ? new QOpcion(forProperty("opcion"), inits.get("opcion")) : null;
        this.rol = inits.isInitialized("rol") ? new QRol(forProperty("rol"), inits.get("rol")) : null;
    }

}

