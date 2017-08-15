package com.jacoli.controllers;

import com.jacoli.DO.ItemDO;
import com.jacoli.mappers.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lichuange on 2017/8/15.
 */
@Controller
public class AdminController {

    @Autowired
    private ItemsMapper itemsMapper;

    @RequestMapping("/index")
    public String adminMain() {
        return "index";
    }

    @RequestMapping("/chart")
    public String chart() {
        return "chart";
    }

    @RequestMapping("/empty")
    public String empty() {
        return "empty";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/morris-chart")
    public String morrisChart() {
        return "morris-chart";
    }

    @RequestMapping("/tab-pannel")
    public String tabPannel() {
        return "tab-pannel";
    }

    @RequestMapping("/table")
    public ModelAndView table() {
        ModelAndView modelAndView = new ModelAndView("/table");
        List<ItemDO> items = itemsMapper.getItems();
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @RequestMapping("/ui-elements")
    public String uiElements() {
        return "ui-elements";
    }
}
