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
import pe.gob.midis.dgfo.dof.entity.Modulo;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QModulo extends EntityPathBase<Modulo> {

    private static final long serialVersionUID = 1241478261L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QModulo modulo = new QModulo("modulo");

    public final StringPath descripcionModulo = createString("descripcionModulo");

    public final NumberPath<Integer> idModulo = createNumber("idModulo", Integer.class);

    public final ListPath<Menu, QMenu> menus = this.<Menu, QMenu>createList("menus", Menu.class, QMenu.class, PathInits.DIRECT2);

    public final QSistema sistema;

    public QModulo(String variable) {
        this(Modulo.class, forVariable(variable), INITS);
    }

    public QModulo(Path<? extends Modulo> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QModulo(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QModulo(PathMetadata<?> metadata, PathInits inits) {
        this(Modulo.class, metadata, inits);
    }

    public QModulo(Class<? extends Modulo> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
    }

}

