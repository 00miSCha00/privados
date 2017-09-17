package pe.gob.midis.dgfo.dof.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;

import pe.gob.midis.dgfo.dof.entity.RolPerfil;


/**
 * QRolperfil is a Querydsl query type for Rolperfil
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRolperfil extends EntityPathBase<RolPerfil> {

    private static final long serialVersionUID = -1171174916L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRolperfil rolperfil = new QRolperfil("rolperfil");

    public final NumberPath<Integer> idRolPerfil = createNumber("idRolPerfil", Integer.class);

    public final QPerfil perfil;

    public final QRol rol;

    public QRolperfil(String variable) {
        this(RolPerfil.class, forVariable(variable), INITS);
    }

    public QRolperfil(Path<? extends RolPerfil> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRolperfil(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRolperfil(PathMetadata metadata, PathInits inits) {
        this(RolPerfil.class, metadata, inits);
    }

    public QRolperfil(Class<? extends RolPerfil> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.perfil = inits.isInitialized("perfil") ? new QPerfil(forProperty("perfil"), inits.get("perfil")) : null;
        this.rol = inits.isInitialized("rol") ? new QRol(forProperty("rol"), inits.get("rol")) : null;
    }

}

