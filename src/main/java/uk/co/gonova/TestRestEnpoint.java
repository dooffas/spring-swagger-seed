package uk.co.gonova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestEnpoint {

    @GetMapping(path = "/test")
    public String testEndpoint (){
        return "Hello World!";
    }

}
