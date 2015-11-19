/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author migueljimenez
 */
@Entity
@Table(name = "Pedidos", schema = "Calidad_Software")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findByIdPedido", query = "SELECT p FROM Pedidos p WHERE p.idPedido = :idPedido"),
    @NamedQuery(name = "Pedidos.findByFechaCreacion", query = "SELECT p FROM Pedidos p WHERE p.fechaCreacion = :fechaCreacion"),
    @NamedQuery(name = "Pedidos.findByCotizacion", query = "SELECT p FROM Pedidos p WHERE p.cotizacion = :cotizacion"),
    @NamedQuery(name = "Pedidos.findByNombreCliente", query = "SELECT p FROM Pedidos p WHERE p.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Pedidos.findByDireccionCliente", query = "SELECT p FROM Pedidos p WHERE p.direccionCliente = :direccionCliente"),
    @NamedQuery(name = "Pedidos.findByTelefonoCliente", query = "SELECT p FROM Pedidos p WHERE p.telefonoCliente = :telefonoCliente"),
    @NamedQuery(name = "Pedidos.findByEmailCliente", query = "SELECT p FROM Pedidos p WHERE p.emailCliente = :emailCliente"),
    @NamedQuery(name = "Pedidos.findByFechaEnvioCot", query = "SELECT p FROM Pedidos p WHERE p.fechaEnvioCot = :fechaEnvioCot")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPedido")
    private Integer idPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cotizacion")
    private boolean cotizacion;
    @Size(max = 250)
    @Column(name = "NombreCliente")
    private String nombreCliente;
    @Size(max = 250)
    @Column(name = "DireccionCliente")
    private String direccionCliente;
    @Size(max = 45)
    @Column(name = "TelefonoCliente")
    private String telefonoCliente;
    @Size(max = 45)
    @Column(name = "EmailCliente")
    private String emailCliente;
    @Column(name = "FechaEnvioCot")
    @Temporal(TemporalType.DATE)
    private Date fechaEnvioCot;
    @JoinColumn(name = "idCliente", referencedColumnName = "idClientes")
    @ManyToOne(optional = false)
    private Clientes idCliente;
    @JoinColumn(name = "idEstadoPedido", referencedColumnName = "idEstadosPedido")
    @ManyToOne(optional = false)
    private EstadosPedido idEstadoPedido;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Productos idProducto;
    @JoinColumn(name = "idVendedores", referencedColumnName = "idVendedores")
    @ManyToOne(optional = false)
    private Vendedores idVendedores;

    public Pedidos() {
    }

    public Pedidos(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Pedidos(Integer idPedido, Date fechaCreacion, boolean cotizacion) {
        this.idPedido = idPedido;
        this.fechaCreacion = fechaCreacion;
        this.cotizacion = cotizacion;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(boolean cotizacion) {
        this.cotizacion = cotizacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Date getFechaEnvioCot() {
        return fechaEnvioCot;
    }

    public void setFechaEnvioCot(Date fechaEnvioCot) {
        this.fechaEnvioCot = fechaEnvioCot;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public EstadosPedido getIdEstadoPedido() {
        return idEstadoPedido;
    }

    public void setIdEstadoPedido(EstadosPedido idEstadoPedido) {
        this.idEstadoPedido = idEstadoPedido;
    }

    public Productos getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Productos idProducto) {
        this.idProducto = idProducto;
    }

    public Vendedores getIdVendedores() {
        return idVendedores;
    }

    public void setIdVendedores(Vendedores idVendedores) {
        this.idVendedores = idVendedores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pedidos[ idPedido=" + idPedido + " ]";
    }
    
}
