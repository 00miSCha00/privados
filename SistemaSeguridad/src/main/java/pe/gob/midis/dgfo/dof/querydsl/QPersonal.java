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

import pe.gob.midis.dgfo.dof.entity.Personal;
import pe.gob.midis.dgfo.dof.entity.Usuario;


/**
 * QPersonal is a Querydsl query type for Personal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersonal extends EntityPathBase<Personal> {

    private static final long serialVersionUID = 107114623L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPersonal personal = new QPersonal("personal");

    public final NumberPath<Integer> activo = createNumber("activo", Integer.class);

    public final StringPath apellidoMaterno = createString("apellidoMaterno");

    public final StringPath apellidoPaterno = createString("apellidoPaterno");

    public final StringPath documentoIdentidad = createString("documentoIdentidad");

    public final NumberPath<Integer> idPersonal = createNumber("idPersonal", Integer.class);

    public final StringPath nombres = createString("nombres");

    public final QPersona persona;

    public final QUnidadnegocio unidadnegocio;

    public final ListPath<Usuario, QUsuario> usuarios = this.<Usuario, QUsuario>createList("usuarios", Usuario.class, QUsuario.class, PathInits.DIRECT2);

    public QPersonal(String variable) {
        this(Personal.class, forVariable(variable), INITS);
    }

    public QPersonal(Path<? extends Personal> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPersonal(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPersonal(PathMetadata metadata, PathInits inits) {
        this(Personal.class, metadata, inits);
    }

    public QPersonal(Class<? extends Personal> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.persona = inits.isInitialized("persona") ? new QPersona(forProperty("persona")) : null;
        this.unidadnegocio = inits.isInitialized("unidadnegocio") ? new QUnidadnegocio(forProperty("unidadnegocio"), inits.get("unidadnegocio")) : null;
    }

}

