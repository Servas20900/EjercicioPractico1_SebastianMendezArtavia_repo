package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.CategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listarMedicamentos(Model model) {
        var categorias = categoriaService.getCategorias();
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalMedicamentos", categorias.size());
        return "/categoria/listado";
    }
}
