
package mx.uacm.curso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @Column(name="id")
    //LE INDICAMOS AJPA EL OMBRE DE LA SECUECIA DE LA TABLA
    //CADA UNA DE LA SECUENCIAS TIENE UN NOMBRE DIFERENTE
    @SequenceGenerator(name="SEC_JAVA_USUARIO",
            sequenceName="datos_usuarios_id_seq",
            allocationSize=1)
    //INDICAMOS QUE CAMOS A USAR UNA ESTRATEGIA DELTIPO
    @GeneratedValue(strategy=GenerationType.SEQUENCE
            ,generator="SEC_JAVA_USUARIO")
    private Integer id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name="activo")
    private String activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    

}
