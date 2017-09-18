package pe.gob.midis.dgfo.dof.entity;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;

import pe.gob.midis.dgfo.dof.entity.RolPerfil;


/**
 * QRolPerfil is a Querydsl query type for RolPerfil
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRolPerfil extends EntityPathBase<RolPerfil> {

    private static final long serialVersionUID = -2087307748L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRolPerfil rolPerfil = new QRolPerfil("rolPerfil");

    public final NumberPath<Integer> idRolPerfil = createNumber("idRolPerfil", Integer.class);

    public final QPerfil perfil;

    public final QRol rol;

    public QRolPerfil(String variable) {
        this(RolPerfil.class, forVariable(variable), INITS);
    }

    public QRolPerfil(Path<? extends RolPerfil> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRolPerfil(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRolPerfil(PathMetadata metadata, PathInits inits) {
        this(RolPerfil.class, metadata, inits);
    }

    public QRolPerfil(Class<? extends RolPerfil> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.perfil = inits.isInitialized("perfil") ? new QPerfil(forProperty("perfil"), inits.get("perfil")) : null;
        this.rol = inits.isInitialized("rol") ? new QRol(forProperty("rol"), inits.get("rol")) : null;
    }

}

