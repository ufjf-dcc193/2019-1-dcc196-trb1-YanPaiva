package br.ufjf.dcc193.tbr01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
   
    //PessoaRepository repPessoa;
    @RequestMapping("index.html")
    ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        //mv.addObject("pessoa",p);
        return mv;
    }
    @RequestMapping("atividades.html")
    ModelAndView atividades(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        //mv.addObject("pessoa",p);
        return mv;
    }
    @Autowired
    MembrosRepository membRep;
    @RequestMapping("funcionarios.html")
    ModelAndView funcionarios(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        List<Membros> funcionarios = membRep.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }
    @RequestMapping("sedes.html")
    ModelAndView sedes(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        //mv.addObject("pessoa",p);
        return mv;
    }
    @RequestMapping("novoFuncionario.html")
    ModelAndView novo(Membros m){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("funcionarios");
        membRep.save(m);
        List<Membros> funcionarios = membRep.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @RequestMapping("novoF.html")
    String form(){
        return "novoFuncionario";
    }

}