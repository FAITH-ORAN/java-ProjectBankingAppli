package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// utiliser la classe scanner pour lire les inputs
		BankAccount objet1=new BankAccount("Sali", "AD567987");
		objet1.showMenu();
		

	}
}

	
	class BankAccount{
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		
		public BankAccount(String customerName,String customerId){
			this.customerName=customerName;
			this.customerId=customerId;
		}
		
		void deposite(int amount) {
			if(amount !=0) {
				balance=balance+amount;
				previousTransaction=amount;
			}
		}
		void withDraw(int amount) {
			if(amount !=0) {
				balance=balance-amount;
				previousTransaction=-amount;
			}
		}
		void getPreviousTransaction() {
			if(previousTransaction>0) {
				System.out.println("déposé: "+previousTransaction);
			}else if(previousTransaction<0) {
				System.out.println("retiré: "+Math.abs(previousTransaction));//Math.abs pour rendre la valeur positive
			}else {
				System.out.println("pas de transaction");
			}
		}
		  void showMenu() {
			char option='\0';
			Scanner scanner=new Scanner(System.in);
			System.out.println("Bienvenue "+customerName);
			System.out.println("votre code client est  "+customerId);
			System.out.println("\n");
			System.out.println("A. Solde ");
			System.out.println("B. Depot ");
			System.out.println("C. Retrait ");
			System.out.println("D. Transaction passée ");
			System.out.println("E. Sortir ");
			
			do {
				System.out.println("*************************************************");
				System.out.println("Choisir une option");
				System.out.println("*************************************************");
				option=scanner.next().charAt(0);;
				
				System.out.println("\n");
				switch(option) {
				case 'A':
					System.out.println("----------------------------------------");
					System.out.println("Solde= "+balance);
					System.out.println("----------------------------------------");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("----------------------------------------");
					System.out.println("montant à déposer: ");
					System.out.println("----------------------------------------");
					int amountDepot=scanner.nextInt();
					deposite(amountDepot);
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("----------------------------------------");
					System.out.println("montant à virer ");
					System.out.println("----------------------------------------");
					int amountVirement=scanner.nextInt();
					withDraw(amountVirement);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("----------------------------------------");
					getPreviousTransaction();
					System.out.println("----------------------------------------");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("----------------------------------------");
					System.out.println("Merci pour votre visite... à bientôt!!!");
					System.out.println("----------------------------------------");
					System.out.println("\n");
					break;
				default:
					
					System.out.println("option invalide");
					break;
					
				}
				
				
			}while( option != 'E');
				
				System.out.println("Merci pour votre visite.");
			
			
			
		}
	}
	

