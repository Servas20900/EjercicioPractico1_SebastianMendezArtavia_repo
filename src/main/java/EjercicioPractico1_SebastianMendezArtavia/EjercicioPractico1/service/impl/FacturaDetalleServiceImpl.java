package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao.FacturaDetalleDao;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.FacturaDetalle;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.FacturaDetalleService;

@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {
    
    @Autowired
    private FacturaDetalleDao facturaDetalleDao;

    @Override
    @Transactional(readOnly=true)
    public List<FacturaDetalle> getFacturaDetalles() {
        return facturaDetalleDao.findAll();
    }
}