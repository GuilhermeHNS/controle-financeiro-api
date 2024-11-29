package io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories;

import io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
