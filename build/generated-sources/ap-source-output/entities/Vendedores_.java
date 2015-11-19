package entities;

import entities.Pedidos;
import entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(Vendedores.class)
public class Vendedores_ { 

    public static volatile SingularAttribute<Vendedores, String> apellidos;
    public static volatile SingularAttribute<Vendedores, Usuarios> idUsuario;
    public static volatile SingularAttribute<Vendedores, String> tipoDoc;
    public static volatile SingularAttribute<Vendedores, String> numDoc;
    public static volatile SingularAttribute<Vendedores, Integer> idVendedores;
    public static volatile SingularAttribute<Vendedores, String> nombres;
    public static volatile CollectionAttribute<Vendedores, Pedidos> pedidosCollection;

}