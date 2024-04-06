package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController{

	@Override
	public float calcPercentualRendimento(Estudante est) {
		return est.getMediaNotas() * (float)est.getQtdAprovacoes() * 0.931f;
	}

	@Override
	public float calcPercentualProgressao(Estudante est) {
		return ((float)est.getQtdAprovacoes() / 3)*100;
	}

}
