package io.github.GuilhermeHNS.controleFinanceiroApi.services;

import io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
