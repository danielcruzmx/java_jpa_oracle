package rest;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id; 
 
@Entity
@Table(name="sireh.tc_jerarquia")
public class Catalogo {
	
    @Id
    @Column(name = "id_jerarquia")
    private String clave;
    
    @Column(name = "desc_jerarquia")
    private String descripcion;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "fec_modifico")
    private Date fecha;
    
    public Catalogo(){
        super();
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
 
    public String getClave() {
        return clave;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getUsuario() {
        return usuario;
    }
 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
 
    public Date getFecha() {
        return fecha;
    }
 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString() {
        return "Catalogo [ descripcion=" + descripcion + "]";
    }

}
