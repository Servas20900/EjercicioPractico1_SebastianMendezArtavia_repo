package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="factura_detalle")
public class FacturaDetalle implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name="id_factura")
    private Factura factura;

    @ManyToOne
    @JoinColumn(name="id_medicamento")
    private Medicamento medicamento;

    private Integer cantidad;
    private Double precioUnitario;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Factura factura, Medicamento medicamento, Integer cantidad, Double precioUnitario) {
        this.factura = factura;
        this.medicamento = medicamento;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
}