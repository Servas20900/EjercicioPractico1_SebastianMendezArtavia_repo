package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name="facturas")
public class Factura implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idFactura;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    private Double total;

    public Factura() {
    }

    public Factura(Date fecha, Cliente cliente, Double total) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
    }
}
