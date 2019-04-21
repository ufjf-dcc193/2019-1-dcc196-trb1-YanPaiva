package br.ufjf.dcc193.tbr01;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
  //  @Autowired
    //PessoaRepository repPessoa;
    @RequestMapping("index.html")
    ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        //mv.addObject("pessoa",p);
        return mv;
    }
    /*
    @RequestMapping("form.html")
    String form(){
        return "form";
    }

    @RequestMapping("pessoas.html")
    ModelAndView pessoas(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("pessoa-list");
        List<Pessoa> pessoas = repPessoa.findAll();       
        mv.addObject("galera", pessoas);
        return mv;
    }
    @RequestMapping("novo.html")
    ModelAndView novo(Pessoa p){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("novo");
        repPessoa.save(p);
        mv.addObject("pessoa", p);
        return mv;
    }*/
}