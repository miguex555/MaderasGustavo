/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author migueljimenez
 */
@Entity
@Table(name = "CLIENTES", schema = "Calidad_Software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByIdClientes", query = "SELECT c FROM Clientes c WHERE c.idClientes = :idClientes"),
    @NamedQuery(name = "Clientes.findByTipoDoc", query = "SELECT c FROM Clientes c WHERE c.tipoDoc = :tipoDoc"),
    @NamedQuery(name = "Clientes.findByNumDoc", query = "SELECT c FROM Clientes c WHERE c.numDoc = :numDoc"),
    @NamedQuery(name = "Clientes.findByNombres", query = "SELECT c FROM Clientes c WHERE c.nombres = :nombres"),
    @NamedQuery(name = "Clientes.findByApellidos", query = "SELECT c FROM Clientes c WHERE c.apellidos = :apellidos"),
    @NamedQuery(name = "Clientes.findByDireccion", query = "SELECT c FROM Clientes c WHERE c.direccion = :direccion"),
    @NamedQuery(name = "Clientes.findByTelefono", query = "SELECT c FROM Clientes c WHERE c.telefono = :telefono"),
    @NamedQuery(name = "Clientes.findByCorreo", query = "SELECT c FROM Clientes c WHERE c.correo = :correo"),
    @NamedQuery(name = "Clientes.findByFechaCreacion", query = "SELECT c FROM Clientes c WHERE c.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Clientes.findByFechaNacimieno", query = "SELECT c FROM Clientes c WHERE c.fechaNacimieno = :fechaNacimieno")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idClientes")
    private Integer idClientes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "TipoDoc")
    private String tipoDoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NumDoc")
    private String numDoc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Apellidos")
    private String apellidos;
    @Size(max = 45)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Telefono")
    private String telefono;
    @Size(max = 45)
    @Column(name = "Correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FechaNacimieno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimieno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Collection<Pedidos> pedidosCollection;

    public Clientes() {
    }

    public Clientes(Integer idClientes) {
        this.idClientes = idClientes;
    }

    public Clientes(Integer idClientes, String tipoDoc, String numDoc, String nombres, String apellidos, String telefono, Date fechaCreacion) {
        this.idClientes = idClientes;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(Integer idClientes) {
        this.idClientes = idClientes;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaNacimieno() {
        return fechaNacimieno;
    }

    public void setFechaNacimieno(Date fechaNacimieno) {
        this.fechaNacimieno = fechaNacimieno;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClientes != null ? idClientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.idClientes == null && other.idClientes != null) || (this.idClientes != null && !this.idClientes.equals(other.idClientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Clientes[ idClientes=" + idClientes + " ]";
    }
    
}
