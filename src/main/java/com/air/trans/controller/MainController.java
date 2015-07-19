package com.air.trans.controller;

/**
 * Created by valera on 12.07.15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "index.jsp", "AirTrans"}, method = RequestMethod.GET)
    public ModelAndView getMainPage() {
        return new ModelAndView("index");
    }
}
