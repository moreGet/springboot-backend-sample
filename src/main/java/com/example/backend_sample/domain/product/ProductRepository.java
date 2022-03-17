package com.example.backend_sample.domain.product;

import com.example.backend_sample.util.ThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Repository
public class ProductRepository {

    public List<Product> findAll() {
        log.info("[ FLOW-03 {} ] [ REPOSITORY ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());
        return Arrays.asList(
                Product.builder().productName("기계식키보드").price(25000).category("노트북/태블릿").deliveryPrice(5000).build(),
                Product.builder().productName("무선마우스").price(12000).category("노트북/태블릿").deliveryPrice(5000).build(),
                Product.builder().productName("아이패드").price(725000).category("노트북/태블릿").deliveryPrice(5000).build());
    }
}