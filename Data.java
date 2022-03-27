package esercitazione_negozio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Data {
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera= new BufferedReader (input);
	public int g;
	public int m;
	public int a;
	public Data(int g1,int m1,int a1) {
		this.g=g1;
		this.m=m1;
		this.a=a1;
		controllo_data();
	}
	
	private void controllo_data() {
		//anno
		if(a<2022) {
			do {
				System.out.println("L'anno inserito non è valido");
				try {
					this.a = Integer.valueOf(tastiera.readLine()).intValue();
				}catch(Exception e) {}
				
			}while(a<2022);
		}
		
		//mese
		
		if(m<1 || m>12) {
			do {
				System.out.println("Il mese inserito non è valido");
			try {
				this.m = Integer.valueOf(tastiera.readLine()).intValue();
			}catch(Exception e) {}
			
		}while(m<1 || m>12);
		}
		
		
		
		//giorno
		if(m==11 || m==4 || m==6 || m==9) {
			if(g<1 || g>30) {
				do {
				try {
					System.out.println("Il giorno inserito non è valido");
					this.g = Integer.valueOf(tastiera.readLine()).intValue();
				}catch(Exception e) {}
				}while(g<1 || g>30);
			}
		}
		else if(m==2) {
			if(this.m%4 == 0) {
				if(g<1 || g>29) {
					do {
					try {
						System.out.println("Il giorno inserito non è valido");
						this.g = Integer.valueOf(tastiera.readLine()).intValue();
					}catch(Exception e) {}
					}while(g<1 || g>29);
				}
			}
			else {
				if(g<1 || g>28) {
					do {
					try {
						System.out.println("Il giorno inserito non è valido");
						this.g = Integer.valueOf(tastiera.readLine()).intValue();
					}catch(Exception e) {}
					}while(g<1 || g>28);
				}
			}
		}
		else {
			if(g<1 || g>31) {
				do {
				try {
					System.out.println("Il giorno inserito non è valido");
					this.g = Integer.valueOf(tastiera.readLine()).intValue();
				}catch(Exception e) {}
				}while(g<1 || g>31);
			}
		}
	}
	
	public String get_data() {
		String output = String.format("%d/%d/%d", g, m, a);
		return output;
	}

}
