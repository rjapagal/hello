/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * @author 320087222
 *
 */
public class HelloController {
    
    @GetMapping(value="/")
    public String wishHello() {
        return "hello junk!";
    }

}
