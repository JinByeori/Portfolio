package model;

public class Hamburger {

	private int e_num;
	private String menu;
	private String recipe;

	public Hamburger(int e_num, String menu, String recipe) {
		this.e_num = e_num;
		this.menu = menu;
		this.recipe = recipe;
	}

	public Hamburger(String menu, String recipe) {
		this.menu = menu;
		this.recipe = recipe;
	}

	public int getE_num() {
		return e_num;
	}

	public String getMenu() {
		return menu;
	}

	public String getRecipe() {
		return recipe;
	}

}
