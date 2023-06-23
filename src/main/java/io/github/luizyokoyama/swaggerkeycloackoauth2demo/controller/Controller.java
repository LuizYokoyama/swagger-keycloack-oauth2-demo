package io.github.luizyokoyama.swaggerkeycloackoauth2demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Operation(summary = "Get a info by its id")
    @GetMapping("info/{id}")
    public String getById(@Parameter(description = "id of info to be searched") @PathVariable long id) {
        return "Info "+id+" OK";

    }

    @Operation(summary = "Post a info by its id")
    @PostMapping("info/{id}")
    public String postById(@Parameter(description = "id of info to be posted") @PathVariable long id) {
        return "Info "+id+" OK";

    }

}
