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
@Table(name = "EstadosPedido", schema = "Calidad_Software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadosPedido.findAll", query = "SELECT e FROM EstadosPedido e"),
    @NamedQuery(name = "EstadosPedido.findByIdEstadosPedido", query = "SELECT e FROM EstadosPedido e WHERE e.idEstadosPedido = :idEstadosPedido"),
    @NamedQuery(name = "EstadosPedido.findByEstado", query = "SELECT e FROM EstadosPedido e WHERE e.estado = :estado")})
public class EstadosPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstadosPedido")
    private Integer idEstadosPedido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoPedido")
    private Collection<Pedidos> pedidosCollection;

    public EstadosPedido() {
    }

    public EstadosPedido(Integer idEstadosPedido) {
        this.idEstadosPedido = idEstadosPedido;
    }

    public EstadosPedido(Integer idEstadosPedido, String estado) {
        this.idEstadosPedido = idEstadosPedido;
        this.estado = estado;
    }

    public Integer getIdEstadosPedido() {
        return idEstadosPedido;
    }

    public void setIdEstadosPedido(Integer idEstadosPedido) {
        this.idEstadosPedido = idEstadosPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (idEstadosPedido != null ? idEstadosPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadosPedido)) {
            return false;
        }
        EstadosPedido other = (EstadosPedido) object;
        if ((this.idEstadosPedido == null && other.idEstadosPedido != null) || (this.idEstadosPedido != null && !this.idEstadosPedido.equals(other.idEstadosPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.EstadosPedido[ idEstadosPedido=" + idEstadosPedido + " ]";
    }
    
}
