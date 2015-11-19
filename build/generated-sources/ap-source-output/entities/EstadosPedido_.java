package entities;

import entities.Pedidos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(EstadosPedido.class)
public class EstadosPedido_ { 

    public static volatile SingularAttribute<EstadosPedido, String> estado;
    public static volatile SingularAttribute<EstadosPedido, Integer> idEstadosPedido;
    public static volatile CollectionAttribute<EstadosPedido, Pedidos> pedidosCollection;

}