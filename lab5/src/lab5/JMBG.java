package lab5;

import java.util.Scanner;

public class JMBG {

	public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Molim vas unesite vas maticni broj: ");
 String jmbg = in.nextLine();
		
		String dan = jmbg.substring(0, 2);
		String mjesec = jmbg.substring(2, 4);
		String godina = jmbg.substring(4, 7);
		String politickaRegija = jmbg.substring(7, 9);
		String jedinstveniBroj = jmbg.substring(9, 12);
		String kontrola = jmbg.substring(12);
		System.out.println("Dan: " + dan);
		System.out.println("Mjesec: " + mjesec);
		System.out.println("Godina: " + godina);
		System.out.println("Politicka regija: " + politickaRegija);
		System.out.println("Jedinstveni broj: " + jedinstveniBroj);
		System.out.println("Kontrola: " + kontrola);

		System.out.println(dan + "." + mjesec + ".1" + godina);

		String jedan = jmbg.substring(0, 1);
		String dva = jmbg.substring(1, 2);
		String tri = jmbg.substring(2, 3);
		String cetri = jmbg.substring(3, 4);
		String pet = jmbg.substring(4, 5);
		String sest = jmbg.substring(5, 6);
		String sedam = jmbg.substring(6, 7);
		String osam = jmbg.substring(7, 8);
		String devet = jmbg.substring(8, 9);
		String deset = jmbg.substring(9, 10);
		String jedanaest = jmbg.substring(10, 11);
		String dvanaest = jmbg.substring(11, 12);
		String trinaest = jmbg.substring(12, 13);
		
		long jedanl = Long.parseLong(jedan); //a
		long dval = Long.parseLong(dva); //b
		long tril = Long.parseLong(tri);//c
		long cetril = Long.parseLong(cetri);//d
		long petl = Long.parseLong(pet);//e
		long sestl = Long.parseLong(sest);//f
		long sedaml = Long.parseLong(sedam);//g
		long osaml = Long.parseLong(osam);//h
		long devetl = Long.parseLong(devet);//i
		long desetl = Long.parseLong(deset);//j
		long jedanaestl = Long.parseLong(jedanaest);//k
		long dvanaestl = Long.parseLong(dvanaest);//l
		long trinaestl = Long.parseLong(trinaest);//m
		
		long rezultat = (7*jedanl + 6*dval +5*tril + 4*cetril + 3*petl +2*sestl
				+ 7*sedaml +6*osaml +5*devetl +4*desetl +3*jedanaestl+2*dvanaestl);
		long rezultatDjeljenja = (rezultat % 11);
		 	   		if (rezultatDjeljenja  == 0  || rezultatDjeljenja + trinaestl == 11) {
			      System.out.println("Authentikacija JE prosla");
		 	   		} else { System.out.println("Authentikacija nije prosla");}
	in.close();}

}
