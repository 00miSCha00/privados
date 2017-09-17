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

import pe.gob.midis.dgfo.dof.entity.Opcion;
import pe.gob.midis.dgfo.dof.entity.Permiso;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOpcion extends EntityPathBase<Opcion> {

    private static final long serialVersionUID = 1299618853L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOpcion opcion = new QOpcion("opcion");

    public final StringPath descripcionOpcion = createString("descripcionOpcion");

    public final NumberPath<Integer> idOpcion = createNumber("idOpcion", Integer.class);

    public final QMenu menu;

    public final ListPath<Permiso, QPermiso> permisos = this.<Permiso, QPermiso>createList("permisos", Permiso.class, QPermiso.class, PathInits.DIRECT2);

    public QOpcion(String variable) {
        this(Opcion.class, forVariable(variable), INITS);
    }

    public QOpcion(Path<? extends Opcion> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpcion(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOpcion(PathMetadata<?> metadata, PathInits inits) {
        this(Opcion.class, metadata, inits);
    }

    public QOpcion(Class<? extends Opcion> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.menu = inits.isInitialized("menu") ? new QMenu(forProperty("menu"), inits.get("menu")) : null;
    }

}

