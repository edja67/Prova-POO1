package avaliacao1;

public class contab {
       
	    private int Numero;
		private banco Banco;
		private clienteb cliente;
		private double saldo;
		
		
		public contab(int numero, banco Banco, clienteb cliente, double saldo) {
			super();
			this.Numero = numero;
			this.Banco = Banco;
			this.cliente = cliente;
			this.saldo = saldo;
			

	}


		public int getNumero() {
			return Numero;
		}


		public void setNumero(int numero) {
			Numero = numero;
		}


		public banco getBanco() {
			return Banco;
		}


		public void setBanco(banco banco) {
			Banco = banco;
		}


		public clienteb getCliente() {
			return cliente;
		}


		public void setCliente(clienteb cliente) {
			this.cliente = cliente;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

