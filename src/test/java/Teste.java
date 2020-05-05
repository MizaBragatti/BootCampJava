import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Teste {
	private static Carro fusca;
	private static Moto cg150;

	@BeforeAll
	public static void criaVeiculos() {
		fusca = new Carro("Branca", "Volkswagen", 120.0);
		cg150 = new Moto("Preta", "Honda", 150.0, 150);
		
	}

	@Test
	public void testaCarro() {

		if (fusca.ligaedesliga())
			fusca.acelera(60.0);

		// Primeiro teste verifica se está dentro do limite de velocidade
		Assertions.assertEquals(60.0, fusca.velocidadeAtual.doubleValue(), "Velocidade não está correta.");

		// Segundo teste verifica se veículo foi ligado corretamente.
		Assertions.assertEquals(true, fusca.getLigado(), "Veículo não está ligado.");

		// Terceiro teste verifica se veículo está na marcha correta.
		Assertions.assertEquals(1, fusca.pegaMarcha().intValue(), "Veículo não está ligado.");
	}
	
	@Test
	public void testaMoto() {
		if (cg150.ligaedesliga())
			cg150.acelera(100.0);

		// Primeiro teste verifica se está dentro do limite de velocidade
		Assertions.assertEquals(100.0, cg150.velocidadeAtual.doubleValue(), "Velocidade não está correta.");

		// Segundo teste verifica se veículo foi ligado corretamente.
		Assertions.assertEquals(true, cg150.getLigado(), "Veículo não está ligado.");

		// Terceiro teste verifica se veículo está com cilindrada correta.
		Assertions.assertEquals(150, cg150.getCilindrada(), "Veículo não está ligado.");
	}
}