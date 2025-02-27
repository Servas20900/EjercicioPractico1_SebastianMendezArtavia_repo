package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.ClienteService;


@Controller
@Slf4j
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listado")
    public String listarMedicamentos(Model model) {
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        model.addAttribute("totalClientes", clientes.size());
        return "/cliente/listado";
    }
}