package io.github.luizyokoyama.swaggerkeycloackoauth2demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Operation(summary = "Get a info by its id")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The infos were founded and returned."),
                    @ApiResponse(responseCode = "401", description = "The request requires authentication"),
                    @ApiResponse(responseCode = "403", description = "Authority privilege of read not provided")})
    @GetMapping("info/{id}")
    public String getById(@Parameter(description = "id of info to be searched") @PathVariable long id) {
        return "Info "+id+" OK";

    }

    @Operation(summary = "Post a info by its id")
    @ApiResponses({ @ApiResponse(responseCode = "200", description = "The infos were posted and returned."),
                    @ApiResponse(responseCode = "401", description = "The request requires authentication"),
                    @ApiResponse(responseCode = "403", description = "Authority privilege of write not provided")})
    @PostMapping("info/{id}")
    public String postById(@Parameter(description = "id of info to be posted") @PathVariable long id) {
        return "Info "+id+" OK";

    }

}
