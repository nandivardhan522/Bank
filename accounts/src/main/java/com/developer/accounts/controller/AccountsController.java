package com.developer.accounts.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/accounts",produces={MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {

}
