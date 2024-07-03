package exercise01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
	public static void main(String[] args) {
		ArrayList<String> dc = new ArrayList<String>();
		dc.add("Batman");
		dc.add("Aquaman");
		dc.add("Superman");
		System.out.println("- API add(): ");
		System.out.println(dc);
		System.out.println("\n");

		ArrayList<String> superheros = new ArrayList<String>();
		superheros.add("The Flash");
		superheros.add("Wonder Woman");
		superheros.add("Green Lantern");
		superheros.add("Martian Manhunter");

		dc.addAll(superheros);
		System.out.println("- API addAll():");
		System.out.println(dc);
		System.out.println("\n");

		System.out.println("- API get():");
		System.out.println(dc.get(3));
		System.out.println("\n");

		System.out.println("- API iterator():");
		Iterator<String> i = dc.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		System.out.println("\n");

		superheros.set(0, "Flash");
		System.out.println("- API set():");
		System.out.println(superheros);
		System.out.println("\n");

		dc.remove(6);
		System.out.println("- API remove():");
		System.out.println(dc);
		System.out.println("\n");

		System.out.println("- API removeAll():");
		System.out.println(superheros);
		superheros.removeAll(superheros);
		System.out.println(superheros);
		System.out.println("\n");

		superheros.add("The Flash");
		superheros.add("Wonder Woman");
		System.out.println("- API clear():");
		System.out.println(superheros);
		superheros.clear();
		System.out.println(superheros);
		System.out.println("\n");

		System.out.println("- API size():");
		System.out.println(dc.size());
		System.out.println("\n");

		System.out.println("- API toArray():");
		Object[] superHeros = dc.toArray();
		for (Object hero : superHeros) {
			System.out.print(hero + " ");
		}
		System.out.println("\n");

		System.out.println("- API contains():");
		System.out.println(dc.contains("Batman"));
	}
}
