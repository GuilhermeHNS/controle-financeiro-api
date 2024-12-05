package io.github.GuilhermeHNS.controleFinanceiroApi.controllers;

import io.github.GuilhermeHNS.controleFinanceiroApi.services.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;
}
