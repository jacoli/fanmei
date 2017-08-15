package com.jacoli.controllers;

import com.jacoli.DO.ItemDO;
import com.jacoli.mappers.ItemsMapper;
import com.jacoli.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lichuange on 2017/8/15.
 */
@Controller
public class AdminController {

    @Autowired
    private ItemsMapper itemsMapper;

    @Autowired
    private ItemService itemService;

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

    @RequestMapping("/tab-panel")
    public String tabPannel() {
        return "tab-panel";
    }

    @RequestMapping("/table")
    public ModelAndView table() {
        ModelAndView modelAndView = new ModelAndView("/table");
        modelAndView.addObject("items", itemService.getOnlineItems());
        return modelAndView;
    }

    @RequestMapping("/ui-elements")
    public String uiElements() {
        return "ui-elements";
    }

    @RequestMapping(value = "/create_item", method = RequestMethod.GET)
    public String createItemHtml() {
        return "create_item";
    }

    @RequestMapping(value = "/create_item", method = RequestMethod.POST)
    public String createItem(@RequestParam("title") String title,
                             @Valid @RequestParam("price") long price) {

        ItemDO itemDO = new ItemDO();
        itemDO.setTitle(title);
        itemDO.setPriceInCent(price);

        itemsMapper.insert(itemDO);

        return "create_item";
    }
}
