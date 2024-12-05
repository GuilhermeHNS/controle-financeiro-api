package io.github.GuilhermeHNS.controleFinanceiroApi.services;

import io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
}
