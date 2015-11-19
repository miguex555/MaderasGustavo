package entities;

import entities.Vendedores;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-18T22:39:07")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, String> tipoDoc;
    public static volatile CollectionAttribute<Usuarios, Vendedores> vendedoresCollection;
    public static volatile SingularAttribute<Usuarios, String> numDoc;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuarios;
    public static volatile SingularAttribute<Usuarios, String> nombres;

}