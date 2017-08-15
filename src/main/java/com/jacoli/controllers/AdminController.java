package com.jacoli.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lichuange on 2017/8/15.
 */
@Controller
public class AdminController {

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
    public String table() {
        return "table";
    }

    @RequestMapping("/ui-elements")
    public String uiElements() {
        return "ui-elements";
    }
}
