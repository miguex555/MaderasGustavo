package entities;

import entities.Clientes;
import entities.EstadosPedido;
import entities.Productos;
import entities.Vendedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, String> emailCliente;
    public static volatile SingularAttribute<Pedidos, EstadosPedido> idEstadoPedido;
    public static volatile SingularAttribute<Pedidos, Boolean> cotizacion;
    public static volatile SingularAttribute<Pedidos, String> nombreCliente;
    public static volatile SingularAttribute<Pedidos, Clientes> idCliente;
    public static volatile SingularAttribute<Pedidos, Date> fechaEnvioCot;
    public static volatile SingularAttribute<Pedidos, String> direccionCliente;
    public static volatile SingularAttribute<Pedidos, String> telefonoCliente;
    public static volatile SingularAttribute<Pedidos, Date> fechaCreacion;
    public static volatile SingularAttribute<Pedidos, Productos> idProducto;
    public static volatile SingularAttribute<Pedidos, Integer> idPedido;
    public static volatile SingularAttribute<Pedidos, Vendedores> idVendedores;

}