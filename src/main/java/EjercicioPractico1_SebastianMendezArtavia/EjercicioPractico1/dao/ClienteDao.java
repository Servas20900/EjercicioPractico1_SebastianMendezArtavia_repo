package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Long> {
    
}