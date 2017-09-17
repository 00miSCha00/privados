package pe.gob.midis.dgfo.dof.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;

import pe.gob.midis.dgfo.dof.entity.Permiso;


/**
 * QPermiso is a Querydsl query type for Permiso
 */
@Generated("com.querydsl.codegen.EntitySerializer")
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
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPermiso(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPermiso(PathMetadata metadata, PathInits inits) {
        this(Permiso.class, metadata, inits);
    }

    public QPermiso(Class<? extends Permiso> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.opcion = inits.isInitialized("opcion") ? new QOpcion(forProperty("opcion"), inits.get("opcion")) : null;
        this.rol = inits.isInitialized("rol") ? new QRol(forProperty("rol"), inits.get("rol")) : null;
    }

}

