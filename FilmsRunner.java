package ua.kiev.prog_it.homework.lesson6;

public class FilmsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Film f1 = new Film.Builder("Badlands").genre(FilmGenre.ACTION).yearOfProduction(2017).build();
		f1.addActors("Daniel Vu", "Sara Bolder", "Daniel Stark");

		Film f2 = new Film.Builder("Prison break").genre(FilmGenre.THRILLER).yearOfProduction(2017).build();
		f2.addActors("Ventvort Miller", "Sara Cellis", "Dominik Persell");

		Films films = new Films();
		films.add(f1,f2);
	System.out.println(films.searchByGenre(FilmGenre.THRILLER));
	System.out.println(films.searchByName("Sara Cellis"));
	System.out.println(films.searchByYear(2017) + "\n");
	}
}
