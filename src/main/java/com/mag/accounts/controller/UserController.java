package com.mag.accounts.controller;

import com.mag.accounts.entities.User;
import com.mag.accounts.repository.RoleRepository;
import com.mag.accounts.service.SecurityService;
import com.mag.accounts.service.UserService;
import com.mag.accounts.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private RoleRepository roleRepository;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        //TODO: zastap cyfry zmiennymi
        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Twoja nazwa uzytkownika lub haslo sa nieprawidlowe.");

        if (logout != null)
            model.addAttribute("message", "Wylogowano pomyslnie.");

        return "login";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied(){
//    public ModelAndView accesssDenied() {
// do parametrow dodaje Principal user
//        ModelAndView model = new ModelAndView();
//        if (user != null) {
//            model.addObject("msg", user.getName()
//                    + ", nie powinienes tu byc!");
//        } else {
//            model.addObject("msg",
//                    "Nie powinienes tu byc!");
//        }
//        model.setViewName("403");
        return "403";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }
}