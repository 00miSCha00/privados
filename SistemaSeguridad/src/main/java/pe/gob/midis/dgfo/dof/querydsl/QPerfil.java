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

import pe.gob.midis.dgfo.dof.entity.Perfil;
import pe.gob.midis.dgfo.dof.entity.Rolperfil;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPerfil extends EntityPathBase<Perfil> {

    private static final long serialVersionUID = 1318533067L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPerfil perfil = new QPerfil("perfil");

    public final StringPath descripcionPerfil = createString("descripcionPerfil");

    public final NumberPath<Integer> idPerfil = createNumber("idPerfil", Integer.class);

    public final ListPath<Rolperfil, QRolperfil> rolperfils = this.<Rolperfil, QRolperfil>createList("rolperfils", Rolperfil.class, QRolperfil.class, PathInits.DIRECT2);

    public final QSistema sistema;

    public final QUsuario usuario;

    public QPerfil(String variable) {
        this(Perfil.class, forVariable(variable), INITS);
    }

    public QPerfil(Path<? extends Perfil> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPerfil(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPerfil(PathMetadata<?> metadata, PathInits inits) {
        this(Perfil.class, metadata, inits);
    }

    public QPerfil(Class<? extends Perfil> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
        this.usuario = inits.isInitialized("usuario") ? new QUsuario(forProperty("usuario"), inits.get("usuario")) : null;
    }

}

