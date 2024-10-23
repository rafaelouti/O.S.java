package com.exemplo.ordemservico.repository;

import com.exemplo.ordemservico.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
}
