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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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

    @RequestMapping(value = "/show")
    public ModelAndView show(Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("led-produce-list");
        Page<Product> page = productService.findPager(pageable);
        modelAndView.addObject("page", page);
        return modelAndView;
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
