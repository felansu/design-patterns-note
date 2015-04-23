package br.com.padroes.bridge.ex2;

public class BoletoBB implements Boleto{

	private GeradorBoleto gerador;
	
	public BoletoBB(GeradorBoleto gerador) {
		this.gerador = gerador;
	}

	@Override
	public void gerarBoleto() {
		this.gerador.geradorBoleto("Este � um boleto BB");
	}

	public GeradorBoleto getGerador() {
		return gerador;
	}

	public void setGerador(GeradorBoleto gerador) {
		this.gerador = gerador;
	}
}