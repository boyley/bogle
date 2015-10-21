package com.bogle.erp.controller;

import com.bogle.erp.controller.web.Api;
import com.bogle.erp.entity.Product;
import com.bogle.erp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2015/10/3.
 */
@RestController
@RequestMapping(value = "led")
public class LedProduceController {

    private static final Logger log = LoggerFactory.getLogger(LedProduceController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Product> show(@RequestBody Pageable pageable) {
        log.info("size:" + pageable.getPageSize() + ",number:" + pageable.getPageNumber());
        Page<Product> page = productService.findPager(pageable);
        return page;
    }


    @RequestMapping(value = "/save", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    public
    @ResponseBody
    Api<Product> add(Product product) {
        log.info("save.................");
        product = this.productService.save(product);
        Api<Product> api = new Api<>(!product.isNew(), HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), product);
        return api;
    }

    @RequestMapping(value = "/edit")
    public ModelAndView edit() {
        ModelAndView modelAndView = new ModelAndView("led-produce-edit");
        return modelAndView;
    }


}
