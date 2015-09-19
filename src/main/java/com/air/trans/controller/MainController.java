package com.air.trans.controller;

/**
 * Created by valera on 12.07.15.
 */

import com.air.trans.repositories.CredentialsRepo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    private CredentialsRepo repo;

    private static final Logger LOGGER = Logger.getLogger(MainController.class);
    @RequestMapping(value = {"/", "index.jsp", "AirTrans"}, method = RequestMethod.GET)
    public ModelAndView getMainPage() {
        LOGGER.info(repo.findAll());
        return new ModelAndView("index");
    }
}
