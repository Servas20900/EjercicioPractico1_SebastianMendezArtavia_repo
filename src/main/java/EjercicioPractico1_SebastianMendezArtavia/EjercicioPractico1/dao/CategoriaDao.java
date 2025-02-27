package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}