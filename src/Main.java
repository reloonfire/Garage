import java.util.Scanner;

public class Main 
{
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[]args)
	{
		menu();
	}
	
	public static void menu()
	{
		String sel="";
		Garage g= new Garage();
		while(!sel.equals("3")) {
			
			System.out.println("\nMENU DEL GARAGE:\n\nInserire:\n0)Per immettere un veicolo nel garage\n1)Per rimuovere un veicolo dal garage\n2)Per visualizzare il garage\n3)Per uscire dal programma");
			sel=sc.nextLine();
			
			
			switch(sel)
			{
				case "0":	System.out.println("\n0)Per immettere un'automobile\n1)Per immettere un furgone\n2)Per immettere una moto");
							
							String scelta=sc.nextLine();
							
							if(scelta.equals("0"))
							{
								g.entraV(a());
								System.out.println("\nAuto inserita correttamente");
							}
							else if(scelta.equals("1"))
							{
								g.entraV(f());
								System.out.println("\nFurgone inserito correttamente");
							}
							else if(scelta.equals("2"))
							{
								g.entraV(m());
								System.out.println("\nMoto inserita correttamente");
							}
							else
							{
								System.out.println("Numero non riconosciuto.");
							}
							break;
						
				case "1":	g.esceV();
							System.out.println("Veicolo rimosso correttamente");
							break;
						
				case "2":	g.stampaG();
							break;
						
				case "3": 	System.out.println("Uscita dal programma in corso..");
							break;
							
				default:	System.out.println("Opzione non riconosciuta. Riprovare.");
							break;
			}
		}
	}
	
	public static VeicoloMotore a()
	{
		/*Chiedere se creare uno "pseudo costruttore" nella classe auto,furgone,moto,ecc senza parametri
		  che esegue il menu e poi richiama il vero costruttore possa andare bene*/
		
		String marca="";
		String anno="";
		String cilindrata="";
		String nPorte="";
		boolean scelta=true;
		String alimentazione="";
		
		System.out.println("Inserire marca: ");
		marca=sc.nextLine();
		System.out.println("Inserire anno: ");
		anno=sc.nextLine();
		System.out.println("Inserire cilindrata: ");
		cilindrata=sc.nextLine();
		System.out.println("Inserire numero delle porte: ");
		nPorte=sc.nextLine();
		while(scelta)
		{
			System.out.println("Scegliere alimentazione:\n0)Benzina\n1)Diesel");
			alimentazione=sc.nextLine();
			if(alimentazione.equals("0"))
			{
				Auto a = new Auto(marca,anno,cilindrata,nPorte,Auto.Alimentazione.Benzina);
				scelta=false;
				return a;
			}
			else if(alimentazione.equals("1"))
			{
				Auto a = new Auto(marca,anno,cilindrata,nPorte,Auto.Alimentazione.Diesel);
				scelta=false;
				return a;
			}
			else
			{
				System.out.println("Numero errato, riprovare.");
			}
		}
		return null;
		
	}
	
	public static VeicoloMotore f()
	{
		String marca="";
		String anno="";
		String cilindrata="";
		String kg="";
		
		System.out.println("Inserire marca: ");
		marca=sc.nextLine();
		System.out.println("Inserire anno: ");
		anno=sc.nextLine();
		System.out.println("Inserire cilindrata: ");
		cilindrata=sc.nextLine();
		System.out.println("Inserire la capacità del furgone in kilogrammi");
		kg=sc.nextLine();
		
		Furgone f = new Furgone(marca, anno, cilindrata, kg);
		return f;
	}
	
	public static VeicoloMotore m()
	{
		String marca="";
		String anno="";
		String cilindrata="";
		String tMotore="";
		
		System.out.println("Inserire marca: ");
		marca=sc.nextLine();
		System.out.println("Inserire anno: ");
		anno=sc.nextLine();
		System.out.println("Inserire cilindrata: ");
		cilindrata=sc.nextLine();
		do
		{
			System.out.println("Inserisci i tempi del motore (o 2 o 4): ");
			tMotore=sc.nextLine();
		}
		while(!tMotore.equals("2") && !tMotore.equals("4"));
		
		Moto m = new Moto(marca, anno, cilindrata, tMotore);
		return m;
	}
	
}
