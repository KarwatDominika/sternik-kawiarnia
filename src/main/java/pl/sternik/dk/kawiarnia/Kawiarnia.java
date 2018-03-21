package pl.sternik.dk.kawiarnia;

import pl.sternik.dk.kawiarnia.dekoratory.BitaSmietana;
import pl.sternik.dk.kawiarnia.dekoratory.Cukier;
import pl.sternik.dk.kawiarnia.ekspres.Ekspres;
import pl.sternik.dk.kawiarnia.ekspres.EkspresCzekolada;
import pl.sternik.dk.kawiarnia.napoje.Czekolada;
import pl.sternik.dk.kawiarnia.napoje.Kawa;
import pl.sternik.dk.kawiarnia.napoje.Napoj;

public abstract class Kawiarnia {

	public static void main(String[] args) {

		Napoj kawa = new Kawa();
		System.out.println(kawa);
		
		kawa = new Cukier(kawa);
		System.out.println(kawa);
	    kawa = new Cukier(kawa);
        System.out.println(kawa);
		kawa = new BitaSmietana(kawa);
		System.out.println(kawa);
		
		System.out.println("-------- Czekolada --------");
		
		Napoj czekolada = new Czekolada();
        System.out.println(czekolada);
        
        czekolada = new BitaSmietana(czekolada);
        System.out.println(kawa);
        
        
		
//		System.out.println("------- Template Metod -----");
//		Ekspres ekspres = new EkspresCzekolada();
//		Napoj napoj = ekspres.dajNapoj();
//		System.out.println(napoj);

	}

}
