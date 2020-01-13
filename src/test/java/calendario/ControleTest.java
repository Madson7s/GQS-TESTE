package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ControleTest {
	
	private Controle controle;
	
	@Before
	public void inicializacao() {
		this.controle = new Controle();
	}
	
	
	@Test
	public void verificaProximoDiaDentroDoMesmoMes() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(1, 1, 2020));
		Data proximoDiaEsperado = new Data(2, 1, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);

	}

	@Test
	public void verificarProximoDiaDepoisDoDia31() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31, 1, 2020));
		Data proximoDiaEsperado = new Data(1, 2, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);

	}

	@Test
	public void verificarDoDia30ParaProximoDia() {
		 Data proximoDiaRetornado;	
		 proximoDiaRetornado = controle.proximoDia(new Data(30, 12, 2020));
		 Data proximoDiaEsperado = new Data(31,12,2020);
		 assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	@Test
	public void verifacarProximoDiaDepoisDoDia30() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30, 4, 2020));
		Data proximoDiaEsperado = new Data(1, 5, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);

	}

	@Test
	public void verifacarProximoAno() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31, 12, 2020));
		Data proximoDiaEsperado = new Data(1, 1, 2021);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);

	}

	@Test
	public void verificarViradaDo28ParaoDiaOPrimeiro() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28, 2, 2020));
		Data proximoDiaEsperado = new Data(1, 3, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}

	@Test
	public void verificaViradaDo29Para01() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(29, 2, 2020));
		Data proximoDiaEsperado = new Data(1, 3, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}

	@Test
	public void verificarDiaAnteriorDoAnoBissexto() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(28, 2, 2020));
		Data proximoDiaEsperado = new Data(29, 2, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}
	
	
	
}
