package esercitazione_negozio;

public class Prodotti {

Barcode barc = new Barcode();
private String codice;
private String descrizione;
private double prezzo;

public Prodotti(String descrizione1 , double prezzo1) {
descrizione = descrizione1;
prezzo = prezzo1;
codice = barc.get_barcode(); 
}

public double get_prezzo(){
return prezzo;
}
public String get_descrizione(){
return descrizione;
}
public void set_prezzo(double prezzo1){
prezzo = prezzo1;
}
public void set_descrizione(String descrizione1){
descrizione = descrizione1;
}
public String get_codice() {
return codice;
}
public void set_codice(String codice1) {
codice = codice1;
}
}
