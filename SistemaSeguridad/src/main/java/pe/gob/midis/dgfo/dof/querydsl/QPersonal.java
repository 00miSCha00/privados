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

import pe.gob.midis.dgfo.dof.entity.Personal;
import pe.gob.midis.dgfo.dof.entity.Usuario;


@Generated("com.mysema.query.codegen.EntitySerializer")
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
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPersonal(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPersonal(PathMetadata<?> metadata, PathInits inits) {
        this(Personal.class, metadata, inits);
    }

    public QPersonal(Class<? extends Personal> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.persona = inits.isInitialized("persona") ? new QPersona(forProperty("persona")) : null;
        this.unidadnegocio = inits.isInitialized("unidadnegocio") ? new QUnidadnegocio(forProperty("unidadnegocio"), inits.get("unidadnegocio")) : null;
    }

}

