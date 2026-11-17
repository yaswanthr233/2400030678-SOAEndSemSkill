
package com.soa.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/ms1/")
    public Map<String, Integer> addition(
            @RequestParam int num1,
            @RequestParam int num2) {

        return Map.of("result", num1 + num2);
    }
}
