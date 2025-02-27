package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.impl;


import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao.CategoriaDao;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Categoria;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.CategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias() {
        return categoriaDao.findAll();
    }
}