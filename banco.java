package avaliacao1;

public class banco { 
	
	private int numeroagencia;
    private String nomeagencia;


    public banco(int numeroagencia, String nomeagencia) {
	this.numeroagencia = numeroagencia;
	this.nomeagencia = nomeagencia;
	
	}


	public int getNumeroagencia() {
		return numeroagencia;
	}


	public void setNumeroagencia(int numeroagencia) {
		this.numeroagencia = numeroagencia;
	}


	public String getNomeagencia() {
		return nomeagencia;
	}


	public void setNomeagencia(String nomeagencia) {
		this.nomeagencia = nomeagencia;
	}
    
    

}
