package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControleTest {
	
	@Test
	public void verificaProximoDiaDentroDoMesmoMes() {
	 Controle controle = new Controle();
	 Data proximoDiaRetronado;	
	 proximoDiaRetronado = controle.proximoDia(new Data(1, 1, 2020));
	 Data proximoDiaEsperado = new Data(2,1,2020);
	 assertEquals(proximoDiaEsperado, proximoDiaRetronado);
	 
 }
	@Test
	public void verifacarProximoDiaDepoisDoDia31() {
		Controle controle = new Controle();
		 Data proximoDiaRetronado;	
		 proximoDiaRetronado = controle.proximoDia(new Data(31, 1, 2020));
		 Data proximoDiaEsperado = new Data(1,2,2020);
		 assertEquals(proximoDiaEsperado, proximoDiaRetronado);
		
		
	}

	@Test
	public void verifacarProximoDiaDepoisDoDia30() {
		Controle controle = new Controle();
		 Data proximoDiaRetronado;	
		 proximoDiaRetronado = controle.proximoDia(new Data(30, 4, 2020));
		 Data proximoDiaEsperado = new Data(1,5,2020);
		 assertEquals(proximoDiaEsperado, proximoDiaRetronado);
		
		
	}
	@Test
	public void verifacarProximoAno() {
		Controle controle = new Controle();
		 Data proximoDiaRetronado;	
		 proximoDiaRetronado = controle.proximoDia(new Data(31, 12, 2020));
		 Data proximoDiaEsperado = new Data(1,1,2021);
		 assertEquals(proximoDiaEsperado, proximoDiaRetronado);
		
		
	}

	
 
}


