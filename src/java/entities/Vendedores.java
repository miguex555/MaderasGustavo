/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author migueljimenez
 */
@Entity
@Table(name = "VENDEDORES", schema = "Calidad_Software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendedores.findAll", query = "SELECT v FROM Vendedores v"),
    @NamedQuery(name = "Vendedores.findByIdVendedores", query = "SELECT v FROM Vendedores v WHERE v.idVendedores = :idVendedores"),
    @NamedQuery(name = "Vendedores.findByTipoDoc", query = "SELECT v FROM Vendedores v WHERE v.tipoDoc = :tipoDoc"),
    @NamedQuery(name = "Vendedores.findByNumDoc", query = "SELECT v FROM Vendedores v WHERE v.numDoc = :numDoc"),
    @NamedQuery(name = "Vendedores.findByNombres", query = "SELECT v FROM Vendedores v WHERE v.nombres = :nombres"),
    @NamedQuery(name = "Vendedores.findByApellidos", query = "SELECT v FROM Vendedores v WHERE v.apellidos = :apellidos")})
public class Vendedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVendedores")
    private Integer idVendedores;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVendedores")
    private Collection<Pedidos> pedidosCollection;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuarios")
    @ManyToOne
    private Usuarios idUsuario;

    public Vendedores() {
    }

    public Vendedores(Integer idVendedores) {
        this.idVendedores = idVendedores;
    }

    public Vendedores(Integer idVendedores, String tipoDoc, String numDoc, String nombres, String apellidos) {
        this.idVendedores = idVendedores;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdVendedores() {
        return idVendedores;
    }

    public void setIdVendedores(Integer idVendedores) {
        this.idVendedores = idVendedores;
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

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVendedores != null ? idVendedores.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedores)) {
            return false;
        }
        Vendedores other = (Vendedores) object;
        if ((this.idVendedores == null && other.idVendedores != null) || (this.idVendedores != null && !this.idVendedores.equals(other.idVendedores))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Vendedores[ idVendedores=" + idVendedores + " ]";
    }
    
}
