package controller;

import model.Estudante;

public interface IEstudanteController {
	
	public float calcPercentualRendimento(Estudante est);
	public float calcPercentualProgressao(Estudante est);

}
