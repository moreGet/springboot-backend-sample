package com.example.backend_sample.controller;

import com.example.backend_sample.aop.annotation.AopConfiguration;
import com.example.backend_sample.domain.product.Product;
import com.example.backend_sample.service.ProductService;
import com.example.backend_sample.util.ThreadLocalUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/product")
@RequiredArgsConstructor
@RestController
public class ProductApiController {
    private final ProductService productService;

    @AopConfiguration
    @GetMapping("/findAll")
    public List<Product> findAll() {
        log.info("[ FLOW-01 {} ] [ CONTROLLER ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());
        return productService.findAll();
    }
}
