package com.example.backend_sample.service;

import com.example.backend_sample.domain.product.Product;
import com.example.backend_sample.domain.product.ProductRepository;
import com.example.backend_sample.exception.ProductNotFoundException;
import com.example.backend_sample.util.ThreadLocalUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        log.info("[ FLOW-02 {} ] [ SERVICE ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());

        List<Product> productList =
                Optional.ofNullable(productRepository.findAll())
                        .filter(list -> list.size() > 3)
                        .orElseThrow(() -> new ProductNotFoundException());
        log.info("[ FLOW-04 {} ] [ SERVICE ] CALL FIND_ALL METHOD {}", ThreadLocalUtil.getUUID(), productList);

        return productList;
    }
}
