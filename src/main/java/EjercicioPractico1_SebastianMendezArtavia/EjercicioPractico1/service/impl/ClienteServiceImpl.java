package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.dao.ClienteDao;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.domain.Cliente;
import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        return clienteDao.findAll();
    }
}