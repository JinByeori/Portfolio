package controller;

import java.util.ArrayList;
import model.Hamburger;
import model.HamburgerGameDAO;

public class Controller {

	Hamburger easy = null;
	HamburgerGameDAO dao = new HamburgerGameDAO();

	public void easyGame() {
//
//		ArrayList<Hamburger> list = dao.easyList();
//		for (Hamburger easy : list) {
//			System.out.println(easy.getE_num()+"\t"+easy.getMenu()+"\t"+easy.getRecipe());
//		}

		ArrayList<Hamburger> easyQ = dao.easyGame();
		for (Hamburger easyq : easyQ) {
			System.out.println(easyq.getMenu());
		}
		for (Hamburger easyq : easyQ) {
			System.out.println(easyq.getRecipe());
		}

	}

	public void normalGame() {

		ArrayList<Hamburger> normalQ = dao.normalGame();
		for (Hamburger normalq : normalQ) {
			System.out.println(normalq.getMenu());
		}

		for (Hamburger normalq : normalQ) {
			System.out.println(normalq.getRecipe());
		}

	}

	public void hardGame() {
		ArrayList<Hamburger> hardQ = dao.hardGame();
		for (Hamburger hardq : hardQ) {
			System.out.println(hardq.getMenu());
		}
		for (Hamburger hardq : hardQ) {
			System.out.println(hardq.getRecipe());
		}
	}
}
