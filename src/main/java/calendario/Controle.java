package calendario;

public class Controle {
	

	public Data proximoDia(Data diaAtual) {
		Data diaSeguinte = new Data(0, 0, 0);
		
		if(diaAtual.getDia() != getUltimoDiaDoMes(diaAtual.getMes(), diaAtual.getAno())) {
			diaSeguinte.setDia(diaAtual.getDia() +1);
			diaSeguinte.setMes(diaAtual.getMes());
			diaSeguinte.setAno(diaAtual.getAno());
		} else {
			diaSeguinte.setDia(1);
			diaSeguinte.setMes(diaAtual.getMes() + 1);
			diaSeguinte.setAno(diaAtual.getAno());
		
			if(diaAtual.getMes() == 12) {
				diaSeguinte.setMes(1);
				diaSeguinte.setAno(diaAtual.getAno() + 1);
			}
		}
		
		return diaSeguinte;
		
	}
	
	private int getUltimoDiaDoMes(int mes, int ano) {
		int ultimoDia;
		int meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(mes==2 && ehBissexto(ano))
			ultimoDia = 29;
		else
			ultimoDia = meses[mes-1];
		return ultimoDia;
		
		
	}
	private boolean ehBissexto(int ano) {
		boolean bissexto = false;
		if(ano % 4 == 0 && ano % 100 !=0) {
			bissexto = true;
		}else if(ano % 400 == 0) {
			bissexto = true;
		}
		return bissexto;
	}
	
}
