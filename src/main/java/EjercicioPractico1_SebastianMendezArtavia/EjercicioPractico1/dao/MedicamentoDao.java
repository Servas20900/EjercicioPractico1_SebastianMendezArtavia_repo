package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao;


import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoDao extends JpaRepository<Medicamento, Long> {
    
}