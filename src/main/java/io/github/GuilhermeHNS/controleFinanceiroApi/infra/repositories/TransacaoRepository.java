package io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories;

import io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Long, Transacao> {
}
