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

import pe.gob.midis.dgfo.dof.entity.Direccion;
import pe.gob.midis.dgfo.dof.entity.ViceMinisterio;


/**
 * QViceMinisterio is a Querydsl query type for ViceMinisterio
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QViceMinisterio extends EntityPathBase<ViceMinisterio> {

    private static final long serialVersionUID = -1244713281L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QViceMinisterio viceMinisterio = new QViceMinisterio("viceMinisterio");

    public final StringPath descripcionViceMinisterio = createString("descripcionViceMinisterio");

    public final ListPath<Direccion, QDireccion> direccions = this.<Direccion, QDireccion>createList("direccions", Direccion.class, QDireccion.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idViceMinisterio = createNumber("idViceMinisterio", Integer.class);

    public final QInstitucion institucion;

    public QViceMinisterio(String variable) {
        this(ViceMinisterio.class, forVariable(variable), INITS);
    }

    public QViceMinisterio(Path<? extends ViceMinisterio> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QViceMinisterio(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QViceMinisterio(PathMetadata metadata, PathInits inits) {
        this(ViceMinisterio.class, metadata, inits);
    }

    public QViceMinisterio(Class<? extends ViceMinisterio> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.institucion = inits.isInitialized("institucion") ? new QInstitucion(forProperty("institucion")) : null;
    }

}

