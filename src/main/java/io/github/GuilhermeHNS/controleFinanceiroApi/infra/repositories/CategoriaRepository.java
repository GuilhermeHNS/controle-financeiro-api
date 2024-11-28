package io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories;

import io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Long, Categoria> {
}
