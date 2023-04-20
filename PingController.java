package org.example;

@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

}

