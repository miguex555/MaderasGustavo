package entities;

import entities.MasterProd;
import entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, MasterProd> idMasterProd;
    public static volatile SingularAttribute<Productos, Integer> idProducto;
    public static volatile SingularAttribute<Productos, String> nombre;
    public static volatile CollectionAttribute<Productos, Pedidos> pedidosCollection;

}