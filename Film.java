package ua.kiev.prog_it.homework.lesson6;

import java.util.ArrayList;

 

public class Film {



	private final String filmName;
	private FilmGenre genre;
	private ArrayList<String> actorsNames = new ArrayList<String>();
	private int yearOfProduction;

	public void addActors(String... actors) {
		for (String str : actors) {
			this.actorsNames.add(str);
		}
	}

	public static class Builder{
		private String filmName;
		private FilmGenre genre;
		private int yearOfProduction;
		
		public Builder(String filmName){
			this.filmName=filmName;
		}
		
		public Builder genre(FilmGenre genre){
			this.genre=genre;
			return this;
		}
		
		public Builder yearOfProduction(int year){
			this.yearOfProduction=year;
			return this;
		}
		
		public Film build(){
		return new Film(this);	
		}
		
	}
	
	public Film(Builder builder){
		this.filmName=builder.filmName;
		this.genre=builder.genre;
		this.yearOfProduction=builder.yearOfProduction;
	}

	public String getFilmName() {
		return filmName;
	}

	public FilmGenre getGenre() {
		return genre;
	}

	public ArrayList<String> getActorsNames() {
		return actorsNames;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}
	@Override
	public String toString() {
		return "Film [filmName=" + filmName + ", genre=" + genre + ", actorsNames=" + actorsNames
				+ ", yearOfProduction=" + yearOfProduction + "]";
	}
}
