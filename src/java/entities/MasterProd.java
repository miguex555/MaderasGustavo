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
@Table(name = "MasterProd", schema = "Calidad_Software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MasterProd.findAll", query = "SELECT m FROM MasterProd m"),
    @NamedQuery(name = "MasterProd.findByIdMasterProd", query = "SELECT m FROM MasterProd m WHERE m.idMasterProd = :idMasterProd"),
    @NamedQuery(name = "MasterProd.findByDescripcion", query = "SELECT m FROM MasterProd m WHERE m.descripcion = :descripcion"),
    @NamedQuery(name = "MasterProd.findByDetalle", query = "SELECT m FROM MasterProd m WHERE m.detalle = :detalle")})
public class MasterProd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMasterProd")
    private Integer idMasterProd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion")
    private String descripcion;
    @Size(max = 250)
    @Column(name = "Detalle")
    private String detalle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMasterProd")
    private Collection<Productos> productosCollection;

    public MasterProd() {
    }

    public MasterProd(Integer idMasterProd) {
        this.idMasterProd = idMasterProd;
    }

    public MasterProd(Integer idMasterProd, String descripcion) {
        this.idMasterProd = idMasterProd;
        this.descripcion = descripcion;
    }

    public Integer getIdMasterProd() {
        return idMasterProd;
    }

    public void setIdMasterProd(Integer idMasterProd) {
        this.idMasterProd = idMasterProd;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @XmlTransient
    public Collection<Productos> getProductosCollection() {
        return productosCollection;
    }

    public void setProductosCollection(Collection<Productos> productosCollection) {
        this.productosCollection = productosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMasterProd != null ? idMasterProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MasterProd)) {
            return false;
        }
        MasterProd other = (MasterProd) object;
        if ((this.idMasterProd == null && other.idMasterProd != null) || (this.idMasterProd != null && !this.idMasterProd.equals(other.idMasterProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.MasterProd[ idMasterProd=" + idMasterProd + " ]";
    }
    
}
