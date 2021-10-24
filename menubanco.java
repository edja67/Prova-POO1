package  avaliacao1;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class menubanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<contab> Contas = new ArrayList<contab>();
		int opt = 0, TipoConta;
		
		String nomeagencia, nomeCliente, cpfcliente;
		int numeroagencia;
		double valordeposito;
		
		
		Random geradorcontab = new Random ();
		
		do {
			System.out.println("1, cadastro");
			System.out.println("2, deposito");
			System.out.println("3, render juros");
			System.out.println("4, consultar numero da agência");
			System.out.println("5, alterar nome e número da agência");
			System.out.println("0,  para sair");
			opt = sc.nextInt();
			
		
		
		switch(opt) {
		
		case 1: System.out.println();
		System.out.println("Nome da Agência: ");
		nomeagencia = sc.next();
		System.out.println("Numero da Agência: ");
		numeroagencia = sc.nextInt();
		System.out.println("Seu nome: ");
		nomeCliente = sc.next();
		System.out.println("CPF: ");
		cpfcliente = sc.next();
		int numConta = geradorcontab.nextInt(100);
		System.out.println("O número da sua conta é: "+numConta);	
					
		System.out.println("1. Poupança");
		System.out.println("2. Outra");
		TipoConta = sc.nextInt(); 
		
		if(TipoConta == 1) 
		{
			Contas.add(new poupanca(numConta, new banco(numeroagencia, nomeagencia), new clienteb(nomeCliente, cpfcliente), 0.0));
		}else
		{
			Contas.add(new contab(numConta, new banco(numeroagencia, nomeagencia), new clienteb(nomeCliente, cpfcliente), 0.0));
		}	
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("Saldo Inicial : 0.0");		
	break;
		
		
		case 2:
			System.out.println("Informe seu CPF: ");
			cpfcliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++){	
				if(Contas.get(i).getCliente().getCpf().equals(cpfcliente))
				{
					System.out.println("Valor a ser depositado: ");
					valordeposito = sc.nextDouble();
					Contas.get(i).setSaldo(valordeposito);
				} 
			}
		break;
		
		case 3:
		
		System.out.println("Informe seu CPF: ");
		cpfcliente = sc.next();
	
		for (int i = 0; i < Contas.size(); i++) 
		{	
			if(Contas.get(i) instanceof poupanca)
			{
			 if(((poupanca) Contas.get(i)).getCliente().getCpf().equals(cpfcliente))
			{
				System.out.println("Rendimento: "+ ((poupanca) Contas.get(i)).RenderJuros());
			} 
			}
	    }
		
		
			break;
		
		case 4:
			System.out.println("Numero da Agência: ");
			numeroagencia = sc.nextInt();
			System.out.println("Nome da Agência: ");
			nomeagencia = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getBanco().getNomeagencia().equals(nomeagencia) && Contas.get(i).getBanco().getNumeroagencia() == numeroagencia) 
				{
					System.out.println("Nome do Cliente: "+Contas.get(i).getCliente().getNome());
					System.out.println("CPF do Cliente: "+Contas.get(i).getCliente().getCpf());
				}
			}
			System.out.println("Agência não cadastrada.");
			break;
			
			
		case 5:
			System.out.println("Informe seu nome: ");
			nomeCliente = sc.next();
			
			for (int i = 0; i < Contas.size(); i++) {
				if(Contas.get(i).getCliente().getNome().equals(nomeCliente)) 
				{
					System.out.println("Novo número da Agência: ");
					numeroagencia = sc.nextInt();
					System.out.println("Nova Agência: ");
					nomeagencia = sc.next();			
					Contas.get(i).getBanco().setNumeroagencia(numeroagencia);
					Contas.get(i).getBanco().setNomeagencia(nomeagencia);
					System.out.println("Dados alterados com sucesso.");
				}
			}	
			break;
		}						
		}while(opt!=0);
	}
		

		
