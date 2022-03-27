package esercitazione_negozio;

public class Nonalimentari extends Prodotti{

Barcode barc = new Barcode();
private String codice;
private String descrizione;
private double prezzo;
private String materiale;

public Nonalimentari(double prezzo1, String descrizione1, String materiale1) {
super(descrizione1, prezzo1);
materiale = materiale1;
this.codice = barc.get_barcode();
}
public String get_materiale() {
return materiale;
}
public void set_materiale(String materiale1) {
materiale = materiale1;
}
}