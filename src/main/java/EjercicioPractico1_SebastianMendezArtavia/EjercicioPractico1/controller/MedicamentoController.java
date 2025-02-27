package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.MedicamentoService;

@Controller
@RequestMapping("/medicamento")
public class MedicamentoController {
    
    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping("/listado")
    public String listarMedicamentos(Model model) {
        var medicamentos = medicamentoService.getMedicamentos();
        model.addAttribute("medicamentos", medicamentos);
        model.addAttribute("totalMedicamentos", medicamentos.size());
        return "/medicamento/listado";
    }
}
