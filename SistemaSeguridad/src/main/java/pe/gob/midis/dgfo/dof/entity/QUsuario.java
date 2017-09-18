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

import pe.gob.midis.dgfo.dof.entity.Perfil;
import pe.gob.midis.dgfo.dof.entity.Usuario;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = -1529158385L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final StringPath clave = createString("clave");

    public final NumberPath<Integer> idUsuario = createNumber("idUsuario", Integer.class);

    public final ListPath<Perfil, QPerfil> perfils = this.<Perfil, QPerfil>createList("perfils", Perfil.class, QPerfil.class, PathInits.DIRECT2);

    public final QPersonal personal;

    public QUsuario(String variable) {
        this(Usuario.class, forVariable(variable), INITS);
    }

    public QUsuario(Path<? extends Usuario> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsuario(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsuario(PathMetadata metadata, PathInits inits) {
        this(Usuario.class, metadata, inits);
    }

    public QUsuario(Class<? extends Usuario> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.personal = inits.isInitialized("personal") ? new QPersonal(forProperty("personal"), inits.get("personal")) : null;
    }

}

