package esercitazione_negozio;
import java.util.Random;

public class Barcode {
	
	private String barcode;
	public Barcode() {
		barcode = "";
		set_barcode();
	}
	
	
	public void set_barcode() {
		String space = " ";
	    String thick = "▮";
	    String thin = "|";
	    Random rand = new Random();
	    for(int i=0;i<20;i++) {
	    	int int_random = rand.nextInt(3);
	    	switch(int_random) {
	    	case 0:
	    		this.barcode +=thin;
	    		break;
	    	case 1:
	    		this.barcode += thick;
	    		break;
	    	case 2:
	    		this.barcode += space;
	    		break;
	    	}
	    }	
	}
	
	public String get_barcode() {
		return barcode;
	}

}
