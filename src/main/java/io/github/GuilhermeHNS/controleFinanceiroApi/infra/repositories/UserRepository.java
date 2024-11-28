package io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories;

import io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
