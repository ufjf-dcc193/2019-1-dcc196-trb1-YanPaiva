package br.ufjf.dcc193.tbr01;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // PessoaRepository repPessoa;
    @RequestMapping("index.html")
    ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        // mv.addObject("pessoa",p);
        return mv;
    }

    @Autowired
    AtividadesRepository atiRep;

    @RequestMapping("atividades.html")
    ModelAndView atividades() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividades> atividades = atiRep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @Autowired
    MembrosRepository membRep;

    @RequestMapping("funcionarios.html")
    ModelAndView funcionarios() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        List<Membros> funcionarios = membRep.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @Autowired
    SedeRepository sedRep;

    @RequestMapping("sedes.html")
    ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        List<Sede> sedes = sedRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("novoFuncionario.html")
    ModelAndView novoMembro(Membros m, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        m.setIdSede(getSede(idSede));
        membRep.save(m);
        List<Membros> funcionarios = membRep.findAll();
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @RequestMapping("novoF.html")
    String newMembro() {
        return "novoFuncionario";
    }

    @RequestMapping("novaSede.html")
    ModelAndView novaSede(Sede s) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        sedRep.save(s);
        List<Sede> sedes = sedRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("novaS.html")
    String newSede() {
        return "novaSede";
    }

    @RequestMapping("novaAtividade.html")
    ModelAndView novaAtividade(Atividades a, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        a.setIdSede(getSede(idSede));
        atiRep.save(a);
        List<Atividades> atividades = atiRep.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    private Sede getSede(Integer idSede) {
        Sede s = sedRep.getOne(idSede);
        return s;
    }

    @RequestMapping("novaA.html")
    String newAtividade(){
        return "novaAtividade";
    }
}