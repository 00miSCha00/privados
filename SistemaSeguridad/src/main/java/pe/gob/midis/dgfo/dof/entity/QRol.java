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

import pe.gob.midis.dgfo.dof.entity.Permiso;
import pe.gob.midis.dgfo.dof.entity.Rol;
import pe.gob.midis.dgfo.dof.entity.RolPerfil;


/**
 * QRol is a Querydsl query type for Rol
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRol extends EntityPathBase<Rol> {

    private static final long serialVersionUID = -58342352L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRol rol = new QRol("rol");

    public final StringPath descripcionRol = createString("descripcionRol");

    public final NumberPath<Integer> idRol = createNumber("idRol", Integer.class);

    public final ListPath<Permiso, QPermiso> permisos = this.<Permiso, QPermiso>createList("permisos", Permiso.class, QPermiso.class, PathInits.DIRECT2);

    public final ListPath<RolPerfil, QRolPerfil> rolperfils = this.<RolPerfil, QRolPerfil>createList("rolperfils", RolPerfil.class, QRolPerfil.class, PathInits.DIRECT2);

    public final QSistema sistema;

    public QRol(String variable) {
        this(Rol.class, forVariable(variable), INITS);
    }

    public QRol(Path<? extends Rol> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRol(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRol(PathMetadata metadata, PathInits inits) {
        this(Rol.class, metadata, inits);
    }

    public QRol(Class<? extends Rol> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
    }

}

