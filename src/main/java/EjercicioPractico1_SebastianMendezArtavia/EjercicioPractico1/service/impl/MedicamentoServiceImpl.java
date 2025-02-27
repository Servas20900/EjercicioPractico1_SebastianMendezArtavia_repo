package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao.MedicamentoDao;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Medicamento;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.MedicamentoService;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
    
    @Autowired
    private MedicamentoDao medicamentoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Medicamento> getMedicamentos() {
        return medicamentoDao.findAll();
    }
}