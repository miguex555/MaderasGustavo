package entities;

import entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(MasterProd.class)
public class MasterProd_ { 

    public static volatile SingularAttribute<MasterProd, String> descripcion;
    public static volatile SingularAttribute<MasterProd, Integer> idMasterProd;
    public static volatile CollectionAttribute<MasterProd, Productos> productosCollection;
    public static volatile SingularAttribute<MasterProd, String> detalle;

}