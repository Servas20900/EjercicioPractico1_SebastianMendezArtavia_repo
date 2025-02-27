package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository<Factura, Long> {
    
}