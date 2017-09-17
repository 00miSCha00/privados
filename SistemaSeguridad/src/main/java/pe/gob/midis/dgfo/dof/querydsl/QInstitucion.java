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

import pe.gob.midis.dgfo.dof.entity.Direccion;
import pe.gob.midis.dgfo.dof.entity.Institucion;
import pe.gob.midis.dgfo.dof.entity.Unidadnegocio;
import pe.gob.midis.dgfo.dof.entity.Viceministerio;


@Generated("com.mysema.query.codegen.EntitySerializer")
public class QInstitucion extends EntityPathBase<Institucion> {

    private static final long serialVersionUID = 1206518986L;

    public static final QInstitucion institucion = new QInstitucion("institucion");

    public final StringPath descripcionInstitucion = createString("descripcionInstitucion");

    public final ListPath<Direccion, QDireccion> direccions = this.<Direccion, QDireccion>createList("direccions", Direccion.class, QDireccion.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idInstitucion = createNumber("idInstitucion", Integer.class);

    public final ListPath<Unidadnegocio, QUnidadnegocio> unidadnegocios = this.<Unidadnegocio, QUnidadnegocio>createList("unidadnegocios", Unidadnegocio.class, QUnidadnegocio.class, PathInits.DIRECT2);

    public final ListPath<Viceministerio, QViceministerio> viceministerios = this.<Viceministerio, QViceministerio>createList("viceministerios", Viceministerio.class, QViceministerio.class, PathInits.DIRECT2);

    public QInstitucion(String variable) {
        super(Institucion.class, forVariable(variable));
    }

    public QInstitucion(Path<? extends Institucion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInstitucion(PathMetadata<?> metadata) {
        super(Institucion.class, metadata);
    }

}

