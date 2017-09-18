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

import pe.gob.midis.dgfo.dof.entity.Menu;
import pe.gob.midis.dgfo.dof.entity.Opcion;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.EntitySerializer")
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
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenu(PathMetadata metadata, PathInits inits) {
        this(Menu.class, metadata, inits);
    }

    public QMenu(Class<? extends Menu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.modulo = inits.isInitialized("modulo") ? new QModulo(forProperty("modulo"), inits.get("modulo")) : null;
    }

}

