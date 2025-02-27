package EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import EjercicioPractico1_SebastianMendezArtavia.EjercicioPractico1.service.FacturaDetalleService;


@Controller
@Slf4j
@RequestMapping("/facturaDetalle")
public class FacturaDetalleController {
    
    @Autowired
    private FacturaDetalleService facturaDetalleService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var facturaDetalles = facturaDetalleService.getFacturaDetalles();
        model.addAttribute("facturaDetalles", facturaDetalles);
        model.addAttribute("totalFacturaDetalles", facturaDetalles.size());
        return "/facturaDetalle/listado";
    }
}
