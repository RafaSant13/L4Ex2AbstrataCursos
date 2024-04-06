package model;

public class EstudanteSuperior extends Estudante {
	
	private String instituicaoSegundograu;
	private int anoConclusaoSegundoGrau;

	public EstudanteSuperior() {
		super();
	}

	public String getInstituicaoSegundograu() {
		return instituicaoSegundograu;
	}

	public void setInstituicaoSegundograu(String instituicaoSegundograu) {
		this.instituicaoSegundograu = instituicaoSegundograu;
	}

	public int getAnoConclusaoSegundoGrau() {
		return anoConclusaoSegundoGrau;
	}

	public void setAnoConclusaoSegundoGrau(int anoConclusaoSegundoGrau) {
		this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
	}
	

}
