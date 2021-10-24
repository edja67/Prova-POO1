package avaliacao1;

	 public class poupanca extends contab{

			final double juros = 4.37; 
			
			public poupanca(int numero, banco Banco, clienteb cliente, double saldo) {
				super(numero, Banco, cliente, saldo);
			}
				
			public double getJuros() {
				return juros;
			}

			public double RenderJuros() {
				
				return super.getSaldo()+super.getSaldo()*(this.juros/100);
				
			}
		



	}
