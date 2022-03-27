package esercitazione_negozio;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alimentari extends Prodotti{

Barcode barc = new Barcode();
private String codice;
private String descrizione;
private double prezzo;
private Data data;

public Alimentari(double prezzo1, String descrizione1, int data1[]) {
	super(descrizione1, prezzo1);
	this.codice = barc.get_barcode();
	this.descrizione=  descrizione1;
	this.prezzo = prezzo1;
	this.data = new Data(data1[0],data1[1],data1[2]);
	
}
public String get_data() {
	return data.get_data();
}
public void set_data(String data1) {
	InputStreamReader input = new InputStreamReader(System.in);
	BufferedReader tastiera= new BufferedReader (input);
	try {
		System.out.println("Inserire la data di scadenza: ");
		System.out.println("Giorno: ");
		data.g = Integer.valueOf(tastiera.readLine()).intValue();
		System.out.println("Mese: ");
		data.m = Integer.valueOf(tastiera.readLine()).intValue();
		System.out.println("Anno: ");
		data.a = Integer.valueOf(tastiera.readLine()).intValue();
	}catch(Exception e) {}
	
}

}
