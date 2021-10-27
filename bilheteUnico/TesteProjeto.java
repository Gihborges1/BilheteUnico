package bilheteUnico;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		ArrayList bilhetes = new ArrayList();
		
		boolean c;
		int i=0;
		
		do {
			i++;
			
			BilheteUnico bilhete = new BilheteUnico();
			
			System.out.println("Digite o nome completo do usuário "+i+": ");
			bilhete.setNome(entrada.nextLine());
			
			bilhetes.add(bilhete);
			
			System.out.println("Deseja fazer mais um cadastro? Digite true se Sim, ou false se Não.");
			c = entrada.nextBoolean();
			entrada.nextLine();
			
		}while(c==true);
		
		for(i=0;i<bilhetes.size();i++) {
			BilheteUnico bilhete = (BilheteUnico) bilhetes.get(i);
			System.out.println("Nome do usuário "+(i+1)+": "+bilhete.getNome());
		}
	}

}
