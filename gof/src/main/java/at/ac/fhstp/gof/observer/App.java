package at.ac.fhstp.gof.observer;

public class App {
    public static void main(String[] args) {
        PublicFigure bobama = new PublicFigure("Barack Obama", "bobama");
		PublicFigure nmodi = new PublicFigure("Narendra Modi", "nmodi");

		Follower ajay = new Follower("Ajay");
		Follower vijay = new Follower("Vijay");
		Follower racheal = new Follower("Racheal");
		Follower micheal = new Follower("Micheal");
		Follower kim = new Follower("Kim");

		bobama.addSubscriber(ajay);
		bobama.addSubscriber(vijay);
		bobama.addSubscriber(racheal);
		bobama.addSubscriber(micheal);
		bobama.addSubscriber(kim);

		nmodi.addSubscriber(ajay);
		nmodi.addSubscriber(vijay);
		nmodi.addSubscriber(racheal);
		nmodi.addSubscriber(micheal);
		nmodi.addSubscriber(kim);

		bobama.tweet("Hello Friends!");
		nmodi.tweet("Vande Matram!");
		bobama.removeSubscriber(racheal);
		bobama.tweet("Stay Home! Stay Safe!");
    }
}
