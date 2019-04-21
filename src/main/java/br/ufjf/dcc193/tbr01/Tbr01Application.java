package br.ufjf.dcc193.tbr01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tbr01Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctx =
		SpringApplication.run(Tbr01Application.class, args);
		//PessoaRepository rep = ctx.getBean(PessoaRepository.class);
		/*Pessoa p1 = new Pessoa("fulano", 23);
		rep.save(p1);
		rep.save(new Pessoa("jonas", 26));
		System.out.println(rep.findAll().toString());	
		*/
		System.out.println("funcionou");
	}

}
