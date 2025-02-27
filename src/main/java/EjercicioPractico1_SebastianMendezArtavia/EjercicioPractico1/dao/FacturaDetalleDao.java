package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.FacturaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDetalleDao extends JpaRepository<FacturaDetalle, Long> {
    
}