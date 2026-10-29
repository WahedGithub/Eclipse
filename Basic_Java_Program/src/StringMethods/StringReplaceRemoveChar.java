package StringMethods;

public class StringReplaceRemoveChar {

	public static void main(String[] args) {
		String s= "this is Demo";
				System.out.println(s.replace("is", "was")); // this will
				System.out.println(s.replaceFirst("is", "was")); //thwas is Demo
				System.out.println(s.replaceAll("is", "was")); //thwas was Demo
				System.out.println(s.replaceAll("is(.)", "was")); //thwaswasDemo
				System.out.println(s.replaceAll("is(.*)", "was")); //thwas
	}

}
