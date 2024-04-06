package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Principal {

	public static void main(String[] args) {
		EstudanteTecnico et = new EstudanteTecnico();
		EstudanteTecnicoController etc = new EstudanteTecnicoController();
		et.setNome("Joao");
		et.setEmail("joao@joao.com");
		et.setRa("1234567890123");
		et.setMediaNotas(9.5f);
		et.setQtdAprovacoes(2);
		
		System.out.println(et.getNome());
		System.out.printf("Percentual de Rendimento: %.1f %%\n",etc.calcPercentualRendimento(et));
		System.out.printf("Percentual de Progressão: %.1f %%\n",etc.calcPercentualProgressao(et));
		
		System.out.println();
		
		EstudanteSuperior es = new EstudanteSuperior();
		EstudanteSuperiorController esc = new EstudanteSuperiorController();
		es.setNome("Maria");
		es.setEmail("maria@maria.com");
		es.setRa("2234567890123");
		es.setMediaNotas(9.5f);
		es.setQtdAprovacoes(4);
		es.setInstituicaoSegundograu("Fatec ZL");
		es.setAnoConclusaoSegundoGrau(2025);
		
		System.out.println(es.getNome());
		System.out.printf("Percentual de Rendimento: %.1f %%\n",esc.calcPercentualRendimento(es));
		System.out.printf("Percentual de Progressão: %.1f %%\n",esc.calcPercentualProgressao(es));
		
	}

}
