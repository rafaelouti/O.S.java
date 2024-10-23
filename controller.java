package com.exemplo.ordemservico.controller;

import com.exemplo.ordemservico.model.OrdemServico;
import com.exemplo.ordemservico.service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens")
public class OrdemServicoController {
    @Autowired
    private OrdemServicoService service;

    @GetMapping
    public List<OrdemServico> listarTodas() {
        return service.listarTodas();
    }

    @PostMapping
    public OrdemServico criar(@RequestBody OrdemServico ordemServico) {
        return service.salvar(ordemServico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
