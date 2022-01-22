public class StringConcat {

	public static void main(String[] args) {
		// 1st way
		String out = "Ajay" + " Gupta" ;
		System.out.println(out);

		// 2nd way
		String s1 = "Ajay";
		String s2 = " Gupta";
		System.out.println(s1.concat(s2));
		
		//Another way
		System.out.println(String.format("%s %s",s1,s2));
		
		// 3rd way
		StringBuilder s3 = new StringBuilder("Ajay");
		StringBuilder s4 = new StringBuilder(" Gupta");
		System.out.println(s3.append(s4).toString());
	}

}
