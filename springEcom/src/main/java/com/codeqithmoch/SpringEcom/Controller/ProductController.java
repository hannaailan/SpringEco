package com.codeqithmoch.SpringEcom.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/produtcs")
    public String getProducts(){
        return "All Products";
    }
}
