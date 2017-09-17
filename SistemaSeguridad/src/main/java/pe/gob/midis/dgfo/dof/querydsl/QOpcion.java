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

import pe.gob.midis.dgfo.dof.entity.Opcion;
import pe.gob.midis.dgfo.dof.entity.Permiso;


/**
 * QOpcion is a Querydsl query type for Opcion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
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
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOpcion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOpcion(PathMetadata metadata, PathInits inits) {
        this(Opcion.class, metadata, inits);
    }

    public QOpcion(Class<? extends Opcion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.menu = inits.isInitialized("menu") ? new QMenu(forProperty("menu"), inits.get("menu")) : null;
    }

}

