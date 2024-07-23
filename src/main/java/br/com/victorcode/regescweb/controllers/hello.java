package br.com.victorcode.regescweb.controllers;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hello {

    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("nome","Maria");
        return mv;
    }
    @GetMapping("/hello-servlet")
    public String hello(HttpServletRequest request){
        request.setAttribute("nome","Victor");
        return "Hello.html";//A nossa página
    }
    @GetMapping("/hello-model")
    public String hello(Model model){
        model.addAttribute("nome","Luiz");
        return "Hello.html";
    }
}
