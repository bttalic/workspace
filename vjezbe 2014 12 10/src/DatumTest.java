public class DatumTest {

	public static void main(String[] args) {

		Datum prviDatum = new Datum(10, 10, 2014);
		Datum drugiDatum = new Datum(10, 10, 2014);

		int rezultat = prviDatum.compare(drugiDatum);
		System.out.println(rezultat);

	}

}
