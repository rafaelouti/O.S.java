package com.exemplo.ordemservico.service;

import com.exemplo.ordemservico.model.OrdemServico;
import com.exemplo.ordemservico.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicoService {
    @Autowired
    private OrdemServicoRepository repository;

    public List<OrdemServico> listarTodas() {
        return repository.findAll();
    }

    public OrdemServico salvar(OrdemServico ordemServico) {
        return repository.save(ordemServico);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
