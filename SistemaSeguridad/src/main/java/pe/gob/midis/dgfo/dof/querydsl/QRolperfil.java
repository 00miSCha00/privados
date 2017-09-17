package pe.gob.midis.dgfo.dof.querydsl;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;

import pe.gob.midis.dgfo.dof.entity.Rolperfil;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRolperfil extends EntityPathBase<Rolperfil> {

    private static final long serialVersionUID = -1171174916L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRolperfil rolperfil = new QRolperfil("rolperfil");

    public final NumberPath<Integer> idRolPerfil = createNumber("idRolPerfil", Integer.class);

    public final QPerfil perfil;

    public final QRol rol;

    public QRolperfil(String variable) {
        this(Rolperfil.class, forVariable(variable), INITS);
    }

    public QRolperfil(Path<? extends Rolperfil> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRolperfil(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRolperfil(PathMetadata<?> metadata, PathInits inits) {
        this(Rolperfil.class, metadata, inits);
    }

    public QRolperfil(Class<? extends Rolperfil> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.perfil = inits.isInitialized("perfil") ? new QPerfil(forProperty("perfil"), inits.get("perfil")) : null;
        this.rol = inits.isInitialized("rol") ? new QRol(forProperty("rol"), inits.get("rol")) : null;
    }

}

