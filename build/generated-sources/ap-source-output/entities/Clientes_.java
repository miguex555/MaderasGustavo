package entities;

import entities.Pedidos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> apellidos;
    public static volatile SingularAttribute<Clientes, Date> fechaNacimieno;
    public static volatile SingularAttribute<Clientes, String> correo;
    public static volatile SingularAttribute<Clientes, String> direccion;
    public static volatile SingularAttribute<Clientes, String> tipoDoc;
    public static volatile SingularAttribute<Clientes, Date> fechaCreacion;
    public static volatile SingularAttribute<Clientes, String> numDoc;
    public static volatile SingularAttribute<Clientes, String> telefono;
    public static volatile SingularAttribute<Clientes, Integer> idClientes;
    public static volatile SingularAttribute<Clientes, String> nombres;
    public static volatile CollectionAttribute<Clientes, Pedidos> pedidosCollection;

}