package com.jedify.api;

import com.jedify.employee.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by j1013575 on 10/31/2015.
 */
@Controller
@RequestMapping(value = Routes.PAGES)
public class WelcomeController {
    @RequestMapping(
            method = RequestMethod.GET,
            value = Routes.NAVIGATE_TO_HOME )
    public ModelAndView navigateToHome(){
        ModelAndView modelAndView =new ModelAndView(Routes.WELCOME_PAGE);
        modelAndView.addObject("employee", new Employee("Sudhanshu", "J123", "India", "Co.in"));
        return modelAndView;
    }
}
