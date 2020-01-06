package calendario;

public class Controle {

	public Data proximoDia(Data dataAtual) {
		Data diaSeguinte = new Data(0, 0, 0);
		
		if(dataAtual.getMes() % 2 != 0 && dataAtual.getDia() == 31) {
			diaSeguinte.setDia(1);
			diaSeguinte.setMes(dataAtual.getMes() + 1);
		
		}
		else {
			diaSeguinte.setDia(dataAtual.getDia() +1);
			diaSeguinte.setMes(dataAtual.getMes());
		}
		
		
		diaSeguinte.setAno(dataAtual.getAno());
		
		return diaSeguinte;
	}
	
}
