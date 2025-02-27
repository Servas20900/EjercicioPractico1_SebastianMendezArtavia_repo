package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idCliente;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
}