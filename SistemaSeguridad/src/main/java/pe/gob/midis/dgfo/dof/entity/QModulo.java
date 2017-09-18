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
import pe.gob.midis.dgfo.dof.entity.Modulo;


/**
 * QModulo is a Querydsl query type for Modulo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
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
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QModulo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QModulo(PathMetadata metadata, PathInits inits) {
        this(Modulo.class, metadata, inits);
    }

    public QModulo(Class<? extends Modulo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
    }

}

