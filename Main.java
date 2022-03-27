package esercitazione_negozio;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.io.*;

public class Main {
	
public static void main(String[] args) {


	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera= new BufferedReader (input);

	boolean condizione2 = true;
	int n = 0,cont=0,i=0;
	int data[] = new int [3];
	double prezzo =0;
	String descrizione="",materiale="";
	Alimentari al[] = new Alimentari[1000];
	Nonalimentari nal[] = new Nonalimentari [1000];

	while(condizione2) {
		System.out.println("1. Inserire alimentari ");
		System.out.println("2. Inserire non alimentari ");
		System.out.println("3. Spesa totale ");
		System.out.println("4.  Esci");
   
		do {
			try{
				System.out.println("Inserire l'interazione: ");
				n = Integer.valueOf(tastiera.readLine()).intValue();
			}catch(Exception e) {}
   
		}while(n<1 && n>4);


		switch(n) {
		case 1 :
			try {
    	
				System.out.println("Inserire il prezzo: ");
				prezzo = Double.parseDouble(tastiera.readLine());
				System.out.println("Inserire la descrizione: ");
				descrizione = tastiera.readLine();
				System.out.println("Inserire la data di scadenza: ");
				System.out.println("Giorno: ");
				data[0] = Integer.valueOf(tastiera.readLine()).intValue();
				System.out.println("Mese: ");
				data[1] = Integer.valueOf(tastiera.readLine()).intValue();
				System.out.println("Anno: ");
				data[2] = Integer.valueOf(tastiera.readLine()).intValue();

    	
				al[cont] = new Alimentari(prezzo,descrizione,data);
				cont++;
			}catch(Exception e) {}

			break;
		case 2:
			try {
				System.out.println("Inserire il prezzo: ");
				prezzo = Double.parseDouble(tastiera.readLine());
    		System.out.println("Inserire la descrizione: ");
    		descrizione = tastiera.readLine();
    		System.out.println("Inserire il materiale: ");
    		materiale = tastiera.readLine();
    	
    		nal[i] = new Nonalimentari(prezzo,descrizione,materiale);
    		i++;
			}catch(Exception e) {}
			break;
		case 3:
			Lista li = new Lista(al,nal,cont,i);
			System.out.println("Spesa totale: "+li.calcSpesa());
			break;
    
		case 4:
			condizione2 = false;
    		break;
    
		default:
			break;
		}
    	}
	}
}
