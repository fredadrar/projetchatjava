package modele;

import java.util.ArrayList;

public class BddAccess {

	private static ArrayList<PostBean> liste = new ArrayList<>();

	public static void addPost(PostBean message) {
		liste.add(message);
	}

	public static ArrayList<PostBean> getPosts() {
		return liste;
	}
}
