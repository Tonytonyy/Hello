/*
 * CommonController.java
 * Copyright 2018 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.qunhe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author damai
 *
 */
@Controller
public class CommonController {

    @RequestMapping(value = "/hello")
    public @ResponseBody
    String hello() {
        return "this is damai";
    }

    @RequestMapping(value = "Kujaile")
    public String kujaile() {
        return "redirect:http://www.kujiale.com/about";
    }

    @RequestMapping(value = "Help")
    public String help() {
        return "redirect:https://bbs.qunhequnhe.com";
    }


}
