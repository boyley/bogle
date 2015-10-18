package com.bogle.erp.controller;

import com.bogle.erp.entity.Product;
import com.bogle.erp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Product add(Product product) {
        log.info("save.................");
        return product;
    }

    @RequestMapping(value = "/edit")
    public ModelAndView edit() {
        ModelAndView modelAndView = new ModelAndView("led-produce-edit");
        return modelAndView;
    }


}
