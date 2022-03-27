package esercitazione_negozio;

public class Lista{
	Alimentari al[];
	Nonalimentari nal[];
	int cont,i;
	
	public Lista(Alimentari al1[],Nonalimentari nal1[],int cont1,int i1) {

		this.al = al1;
		this.cont = cont1;
		this.nal = nal1;
		this.i = i1;
	}
	
	public double calcSpesa() {
		double tot=0.0;
		for(int j=0;j<cont;j++) {
			tot += al[j].get_prezzo();
		}
		for(int j=0;j<i;j++) {
			tot += nal[j].get_prezzo();
		}
		return tot;
	}

}