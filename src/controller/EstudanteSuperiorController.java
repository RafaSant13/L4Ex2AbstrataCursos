package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{

	@Override
	public float calcPercentualRendimento(Estudante est) {
		return est.getMediaNotas() * (float)est.getQtdAprovacoes() * 0.972f;
	}

	@Override
	public float calcPercentualProgressao(Estudante est) {
		return ((float)est.getQtdAprovacoes() / 6)*100;
	}

	

}
