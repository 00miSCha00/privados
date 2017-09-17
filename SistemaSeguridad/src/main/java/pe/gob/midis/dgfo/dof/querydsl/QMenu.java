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

import pe.gob.midis.dgfo.dof.entity.Menu;
import pe.gob.midis.dgfo.dof.entity.Opcion;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = -1808771298L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenu menu = new QMenu("menu");

    public final StringPath descripcionMenu = createString("descripcionMenu");

    public final NumberPath<Integer> idMenu = createNumber("idMenu", Integer.class);

    public final QModulo modulo;

    public final ListPath<Opcion, QOpcion> opcions = this.<Opcion, QOpcion>createList("opcions", Opcion.class, QOpcion.class, PathInits.DIRECT2);

    public QMenu(String variable) {
        this(Menu.class, forVariable(variable), INITS);
    }

    public QMenu(Path<? extends Menu> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenu(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QMenu(PathMetadata<?> metadata, PathInits inits) {
        this(Menu.class, metadata, inits);
    }

    public QMenu(Class<? extends Menu> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.modulo = inits.isInitialized("modulo") ? new QModulo(forProperty("modulo"), inits.get("modulo")) : null;
    }

}

