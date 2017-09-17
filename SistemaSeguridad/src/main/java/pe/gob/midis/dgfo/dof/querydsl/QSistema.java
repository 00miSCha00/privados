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

import pe.gob.midis.dgfo.dof.entity.Modulo;
import pe.gob.midis.dgfo.dof.entity.Perfil;
import pe.gob.midis.dgfo.dof.entity.Rol;
import pe.gob.midis.dgfo.dof.entity.Sistema;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSistema extends EntityPathBase<Sistema> {

    private static final long serialVersionUID = 703216643L;

    public static final QSistema sistema = new QSistema("sistema");

    public final StringPath descripcion = createString("descripcion");

    public final NumberPath<Integer> idSistema = createNumber("idSistema", Integer.class);

    public final ListPath<Modulo, QModulo> modulos = this.<Modulo, QModulo>createList("modulos", Modulo.class, QModulo.class, PathInits.DIRECT2);

    public final ListPath<Perfil, QPerfil> perfils = this.<Perfil, QPerfil>createList("perfils", Perfil.class, QPerfil.class, PathInits.DIRECT2);

    public final ListPath<Rol, QRol> rols = this.<Rol, QRol>createList("rols", Rol.class, QRol.class, PathInits.DIRECT2);

    public QSistema(String variable) {
        super(Sistema.class, forVariable(variable));
    }

    public QSistema(Path<? extends Sistema> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSistema(PathMetadata<?> metadata) {
        super(Sistema.class, metadata);
    }

}

