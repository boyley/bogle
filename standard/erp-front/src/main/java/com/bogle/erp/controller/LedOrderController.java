package com.bogle.erp.controller;

import com.bogle.erp.controller.search.QueryProduce;
import com.bogle.erp.entity.Product;
import com.bogle.erp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 赵波 on 2015/10/28.
 */
@RestController
@RequestMapping(value = "order")
public class LedOrderController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/publish")
    public ModelAndView publish() {
        List<Product> products = productService.find(new QueryProduce());
        ModelAndView modelAndView = new ModelAndView("admin/order/led-order-edit");
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
