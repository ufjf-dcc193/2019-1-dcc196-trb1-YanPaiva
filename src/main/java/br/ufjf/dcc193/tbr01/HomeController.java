package br.ufjf.dcc193.tbr01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("index.html")
    ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        return mv;
    }

    @Autowired
    AtividadesRepository atiRep;

    @RequestMapping("atividades.html")
    ModelAndView atividades(Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        List<Atividades> a = atiRep.findAll();
        ArrayList<Atividades> atividades = new ArrayList<Atividades>();
        for (Atividades ativ : a) {
            if (ativ.getIdSede() == idSede) {
                atividades.add(ativ);
            }
        }
        mv.addObject("atividades", atividades);
        return mv;
    }

    @Autowired
    MembrosRepository membRep;

    @RequestMapping("funcionarios.html")
    ModelAndView funcionarios(Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        List<Membros> f = membRep.findAll();
        ArrayList<Membros> funcionarios = new ArrayList<Membros>();
        for (Membros membros : f) {
            if (membros.getIdSede() == idSede) {
                funcionarios.add(membros);
            }
        }
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
        for (Sede s : sedes) {
            List<Atividades> aux = atiRep.findAll();
            for (Atividades ativ : aux) {
                if (ativ.getIdSede() == sedes.get(sedes.indexOf(s)).getId()) {
                    sedes.get(sedes.indexOf(s)).setHorasAssistencial(
                            sedes.get(sedes.indexOf(s)).getHorasAssistencial() + ativ.getHorasAssistencial());
                    sedes.get(sedes.indexOf(s)).setHorasExecutiva(
                            sedes.get(sedes.indexOf(s)).getHorasExecutiva() + ativ.getHorasExecutiva());
                    sedes.get(sedes.indexOf(s)).setHorasFinanceira(
                            sedes.get(sedes.indexOf(s)).getHorasFinanceira() + ativ.getHorasFinanceira());
                    sedes.get(sedes.indexOf(s))
                            .setHorasJuridica(sedes.get(sedes.indexOf(s)).getHorasJuridica() + ativ.getHorasJuridica());
                }
            }
        }

        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("novoFuncionario.html")
    ModelAndView novoMembro(Membros m, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        m.setIdSede(idSede);
        membRep.save(m);
        List<Membros> f = membRep.findAll();
        ArrayList<Membros> funcionarios = new ArrayList<Membros>();
        for (Membros membros : f) {
            if (membros.getIdSede() == idSede) {
                funcionarios.add(membros);
            }
        }
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
        mv.setViewName("sedes");
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
        a.setIdSede(idSede);
        atiRep.save(a);
        List<Atividades> aux = atiRep.findAll();
        ArrayList<Atividades> atividades = new ArrayList<Atividades>();
        for (Atividades ativ : aux) {
            if (ativ.getIdSede() == idSede) {
                atividades.add(ativ);
            }
        }
        mv.addObject("atividades", atividades);
        return mv;
    }

    private Sede getSede(Integer idSede) {
        Sede s = sedRep.getOne(idSede);
        return s;
    }

    @RequestMapping("novaA.html")
    String novaAtividade() {
        return "novaAtividade";
    }

    @RequestMapping("excluirSede.html")
    ModelAndView excluirSede(Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        sedRep.deleteById(idSede);
        List<Atividades> a = atiRep.findAll();
        List<Membros> m = membRep.findAll();
        for (Atividades atividades : a) {
            if (atividades.getIdSede() == idSede) {
                atiRep.deleteById(atividades.getId());
            }
        }
        for (Membros membros : m) {
            if (membros.getIdSede() == idSede) {
                membRep.deleteById(membros.getId());
            }
        }
        List<Sede> sedes = sedRep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }

    @RequestMapping("informacoesSede.html")
    ModelAndView salvarEdicaoSede(Sede s, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarSede");
        Sede aux = sedRep.getOne(idSede);
        aux.setBairro(s.getBairro()).setCidade(s.getCidade()).setEstado(s.getEstado()).setNome(s.getNome())
                .setTelefone(s.getTelefone()).setId(idSede);
        sedRep.save(aux);
        mv.addObject("sede", getSede(idSede));
        return mv;
    }

    @RequestMapping("editarSede.html")
    ModelAndView editarSede(Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarSede");
        mv.addObject("sede", getSede(idSede));
        return mv;
    }

    @RequestMapping("editarFuncionario.html")
    ModelAndView editarFuncionario(Integer idFunc) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarFuncionario");
        mv.addObject("membro", membRep.getOne(idFunc));
        return mv;
    }

    @RequestMapping("editarAtividade.html")
    ModelAndView editarAtividade(Integer idAtividade) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarAtividade");
        mv.addObject("atividade", atiRep.getOne(idAtividade));
        return mv;
    }

    @RequestMapping("excluirFuncionario.html")
    ModelAndView excluirFuncionarios(Integer idMembro, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("funcionarios");
        membRep.deleteById(idMembro);
        List<Membros> f = membRep.findAll();
        ArrayList<Membros> funcionarios = new ArrayList<Membros>();
        for (Membros membros : f) {
            if (membros.getIdSede() == idSede) {
                funcionarios.add(membros);
            }
        }
        mv.addObject("funcionarios", funcionarios);
        return mv;
    }

    @RequestMapping("excluirAtividade.html")
    ModelAndView excluirAtividade(Integer idAtividade, Integer idSede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        atiRep.deleteById(idAtividade);
        List<Atividades> a = atiRep.findAll();
        ArrayList<Atividades> atividades = new ArrayList<Atividades>();
        for (Atividades ativ : a) {
            if (ativ.getIdSede() == idSede) {
                atividades.add(ativ);
            }
        }
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("salvarFuncionario.html")
    ModelAndView salvarEdicaoFuncionario(Membros m, Integer idSede, Integer idFunc) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarFuncionario");
        Membros aux = membRep.getOne(idFunc);
        aux.setId(idFunc).setIdSede(idSede).setNome(m.getNome()).setFuncao(m.getFuncao()).setEmail(m.getEmail());
        // .setDataEntrada(m.getDataEntrada())
        // .setDataSaida(m.getDataSaida());
        membRep.save(aux);
        mv.addObject("membro", membRep.getOne(idFunc));
        return mv;
    }

    @RequestMapping("salvarAtividade.html")
    ModelAndView salvarEdicaoAtividade(Atividades a, Integer idSede, Integer idAtividade) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editarAtividade");
        Atividades aux = atiRep.getOne(idAtividade);
        aux.setId(idAtividade)
            .setIdSede(idSede)
            .setTitulo(a.getTitulo())
            .setHorasJuridica(a.getHorasJuridica())
            .setHorasAssistencial(a.getHorasAssistencial())
            .setHorasExecutiva(a.getHorasExecutiva())
            .setHorasFinanceira(a.getHorasFinanceira());
        // .setDataFim(a.getDataFim())
        // .setDataInicio(a.getDataInicio());
        atiRep.saveAndFlush(aux);
        mv.addObject("atividade", atiRep.getOne(idAtividade));
        return mv;
    }
}
