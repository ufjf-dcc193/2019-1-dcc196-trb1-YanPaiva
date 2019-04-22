package br.ufjf.dcc193.tbr01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Tbr01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
		SpringApplication.run(Tbr01Application.class, args);
		//PessoaRepository rep = ctx.getBean(PessoaRepository.class);
		/*Pessoa p1 = new Pessoa("fulano", 23);
		rep.save(p1);
		rep.save(new Pessoa("jonas", 26));
		System.out.println(rep.findAll().toString());	
		*/
		SedeRepository sedeRep = ctx.getBean(SedeRepository.class);
		Sede s1 = new Sede();
		s1.setNome("teste").setCidade("jf").setTelefone(32731342);
		sedeRep.save(s1);
		AtividadesRepository ativRep = ctx.getBean(AtividadesRepository.class);
		Atividades ati = new Atividades();
		ati.setTitulo("assda").setIdSede(s1);
		ativRep.save(ati);
		System.out.println(ativRep.findAll().toString());
		System.out.println("funcionou");
	}

}
