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

import pe.gob.midis.dgfo.dof.entity.Direccion;
import pe.gob.midis.dgfo.dof.entity.Institucion;
import pe.gob.midis.dgfo.dof.entity.UnidadNegocio;
import pe.gob.midis.dgfo.dof.entity.ViceMinisterio;


/**
 * QInstitucion is a Querydsl query type for Institucion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QInstitucion extends EntityPathBase<Institucion> {

    private static final long serialVersionUID = 1206518986L;

    public static final QInstitucion institucion = new QInstitucion("institucion");

    public final StringPath descripcionInstitucion = createString("descripcionInstitucion");

    public final ListPath<Direccion, QDireccion> direccions = this.<Direccion, QDireccion>createList("direccions", Direccion.class, QDireccion.class, PathInits.DIRECT2);

    public final NumberPath<Integer> idInstitucion = createNumber("idInstitucion", Integer.class);

    public final ListPath<UnidadNegocio, QUnidadnegocio> unidadnegocios = this.<UnidadNegocio, QUnidadnegocio>createList("unidadnegocios", UnidadNegocio.class, QUnidadnegocio.class, PathInits.DIRECT2);

    public final ListPath<ViceMinisterio, QViceministerio> viceministerios = this.<ViceMinisterio, QViceministerio>createList("viceministerios", ViceMinisterio.class, QViceministerio.class, PathInits.DIRECT2);

    public QInstitucion(String variable) {
        super(Institucion.class, forVariable(variable));
    }

    public QInstitucion(Path<? extends Institucion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInstitucion(PathMetadata metadata) {
        super(Institucion.class, metadata);
    }

}

