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

import pe.gob.midis.dgfo.dof.entity.Permiso;
import pe.gob.midis.dgfo.dof.entity.Rol;
import pe.gob.midis.dgfo.dof.entity.Rolperfil;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRol extends EntityPathBase<Rol> {

    private static final long serialVersionUID = -58342352L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRol rol = new QRol("rol");

    public final StringPath descripcionRol = createString("descripcionRol");

    public final NumberPath<Integer> idRol = createNumber("idRol", Integer.class);

    public final ListPath<Permiso, QPermiso> permisos = this.<Permiso, QPermiso>createList("permisos", Permiso.class, QPermiso.class, PathInits.DIRECT2);

    public final ListPath<Rolperfil, QRolperfil> rolperfils = this.<Rolperfil, QRolperfil>createList("rolperfils", Rolperfil.class, QRolperfil.class, PathInits.DIRECT2);

    public final QSistema sistema;

    public QRol(String variable) {
        this(Rol.class, forVariable(variable), INITS);
    }

    public QRol(Path<? extends Rol> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRol(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QRol(PathMetadata<?> metadata, PathInits inits) {
        this(Rol.class, metadata, inits);
    }

    public QRol(Class<? extends Rol> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
    }

}

