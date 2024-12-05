package io.github.GuilhermeHNS.controleFinanceiroApi.services;

import io.github.GuilhermeHNS.controleFinanceiroApi.infra.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;
}
