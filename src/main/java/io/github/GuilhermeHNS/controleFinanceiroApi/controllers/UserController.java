package io.github.GuilhermeHNS.controleFinanceiroApi.controllers;

import io.github.GuilhermeHNS.controleFinanceiroApi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
}
