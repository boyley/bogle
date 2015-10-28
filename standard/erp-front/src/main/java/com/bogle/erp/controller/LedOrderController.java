package com.bogle.erp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 赵波 on 2015/10/28.
 */
@RestController
@RequestMapping(value = "order")
public class LedOrderController {

    @RequestMapping(value = "/publish")
    public ModelAndView publish() {
        ModelAndView modelAndView = new ModelAndView("admin/order/led-order-edit");
        return modelAndView;
    }
}
