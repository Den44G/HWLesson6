package ua.kiev.prog_it.homework.lesson6;

import java.util.ArrayList;

public class Films {

	private ArrayList<Film> arr = new ArrayList<Film>();
	private ArrayList<Film> searchResultByGenre = new ArrayList<Film>();
	private ArrayList<Film> searchResultByActors = new ArrayList<Film>();
	private ArrayList<Film> searchResultByYear = new ArrayList<Film>();

	public void add(Film... films) {
		for (Film film : films) {
			this.arr.add(film);
		}
	}

	public ArrayList<Film> searchByGenre(FilmGenre genre) {
		for (Film f : arr) {
			if (f.getGenre() == genre) {
				this.searchResultByGenre.add(f);
			}
		}
		return this.searchResultByGenre;
	}

	public ArrayList<Film> searchByName(String name) {
		for (Film f : arr) {
			for (int i = 0; i < f.getActorsNames().size(); i++) {
				if (name.equals(f.getActorsNames().get(i))) {
					this.searchResultByActors.add(f);
				}
			}
		}
		return this.searchResultByActors;
	}

	public ArrayList<Film> searchByYear(int year) {
		for (Film f : arr) {
			if (f.getYearOfProduction() == year) {
				this.searchResultByYear.add(f);
			}
		}
		return this.searchResultByYear;
	}
}
