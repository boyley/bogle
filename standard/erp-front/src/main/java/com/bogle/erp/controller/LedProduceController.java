package com.bogle.erp.controller;

import com.bogle.erp.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2015/10/3.
 */
@RestController
@RequestMapping(value = "led")
public class LedProduceController {

    @RequestMapping(value = "/show")
    public ModelAndView show(Pageable pageable) {
        return null;
    }

    public ModelAndView edit() {
        return null;
    }


}
