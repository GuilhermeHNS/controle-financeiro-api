package io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories;

import io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
