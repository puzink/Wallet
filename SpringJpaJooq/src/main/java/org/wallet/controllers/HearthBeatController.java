package org.wallet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HearthBeatController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
