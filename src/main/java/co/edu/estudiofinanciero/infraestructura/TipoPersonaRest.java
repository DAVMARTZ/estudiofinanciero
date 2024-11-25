/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.estudiofinanciero.infraestructura;
import co.edu.estudiofinanciero.domain.TipoPersonaService;
import co.edu.estudiofinanciero.domain.TipoPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/tipopersonasrest"})
public class TipoPersonaRest {
    
    @Autowired
    TipoPersonaService tpservice;
    
    @GetMapping("/submit/tp")
    public List<TipoPersona> listarTp() {
        return tpservice.listar();
    }
    @PostMapping("/submit")
    public TipoPersona agregar(@RequestBody TipoPersona tp) {
        return tpservice.add(tp);
    }

    @GetMapping("/submit/{id}")
    public TipoPersona listarIdTp(@PathVariable("id_tp") int id_tp) {
        return tpservice.listarIdTp(id_tp);
    }

    @PutMapping("/submit/{id}")
    public TipoPersona editar(@RequestBody TipoPersona tp, @PathVariable("id") int id_tp) {
        tp.setId_tp(id_tp);
        return tpservice.edit(tp);
    }
}
