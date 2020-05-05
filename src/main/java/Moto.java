public class Moto {

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String cor;
	public String modelo;
	public int cilindrada;
	public Double velocidadeAtual;
	public final Double velocidadeMaxima;

	public Boolean ligado = false;

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidadeAtual() {
		return this.velocidadeAtual;
	}

	public Double getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}

	public Boolean getLigado() {
		return this.ligado;
	}

	public Moto(String cor, String modelo, Double velocidadeMaxima, int cilindrada) {
		velocidadeAtual = 0.0;
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.cilindrada = cilindrada;
	}

	// liga a moto
	public Boolean ligaedesliga() {
		if (this.ligado) {
			this.ligado = false;
			System.out.println("A moto foi desligada");
		} else {
			this.ligado = true;
			System.out.println("A moto foi ligada");
		}
		return this.ligado;
	}

	// acelera uma certa quantidade
	public void acelera(Double quantidade) {
		Double velocidadeNova = this.velocidadeAtual + quantidade;
		if (velocidadeNova < this.velocidadeMaxima) {
			this.velocidadeAtual = velocidadeNova;
		}
	}

	// devolve a marcha do carro
	public Integer pegaMarcha() {
		// if (this.velocidadeAtual < 0,0) {
		if (this.velocidadeAtual < 0.0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0.00 || this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
}