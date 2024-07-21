package br.com.victorcode.regescweb.controllers;

import br.com.victorcode.regescweb.Models.Professor;
import br.com.victorcode.regescweb.Models.StatusProfessor;
import org.hibernate.PropertyNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class controllerProfessor {
    @GetMapping("/professores")
    public ModelAndView index(){
        Professor batman = new Professor("Batman",StatusProfessor.ATIVO,new BigDecimal(5000.0));
        batman.setId(1L);
        Professor coringa = new Professor("Coringa",StatusProfessor.APOSENTADO,new BigDecimal(10000.0));
        coringa.setId(2L);
        Professor mulherMaravilha = new Professor("Mulher Maravilha",StatusProfessor.ATIVO,new BigDecimal(8000.0));
        mulherMaravilha.setId(3L);

        List<Professor> professoresList = Arrays.asList(batman,coringa,mulherMaravilha);

        ModelAndView mv = new ModelAndView("professores/index.html");//O endereço do que ele vai retornar
        mv.addObject("professoresList",professoresList);//Isso é como se fosse uma variavel , usamos esse attributeName no Html
        return mv;
    }

    //Model and view é um Objeto, um modelos de dados atrelado a uma view



}
