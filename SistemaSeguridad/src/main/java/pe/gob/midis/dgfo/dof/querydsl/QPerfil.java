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

import pe.gob.midis.dgfo.dof.entity.Perfil;
import pe.gob.midis.dgfo.dof.entity.RolPerfil;


/**
 * QPerfil is a Querydsl query type for Perfil
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPerfil extends EntityPathBase<Perfil> {

    private static final long serialVersionUID = 1318533067L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPerfil perfil = new QPerfil("perfil");

    public final StringPath descripcionPerfil = createString("descripcionPerfil");

    public final NumberPath<Integer> idPerfil = createNumber("idPerfil", Integer.class);

    public final ListPath<RolPerfil, QRolperfil> rolperfils = this.<RolPerfil, QRolperfil>createList("rolperfils", RolPerfil.class, QRolperfil.class, PathInits.DIRECT2);

    public final QSistema sistema;

    public final QUsuario usuario;

    public QPerfil(String variable) {
        this(Perfil.class, forVariable(variable), INITS);
    }

    public QPerfil(Path<? extends Perfil> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPerfil(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPerfil(PathMetadata metadata, PathInits inits) {
        this(Perfil.class, metadata, inits);
    }

    public QPerfil(Class<? extends Perfil> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sistema = inits.isInitialized("sistema") ? new QSistema(forProperty("sistema")) : null;
        this.usuario = inits.isInitialized("usuario") ? new QUsuario(forProperty("usuario"), inits.get("usuario")) : null;
    }

}

