public class Phone {
	public static void main (String[] args) {

		PhoneNumber mynumber = new PhoneNumber("800-GOFEDEX");
		System.out.println("the number is: " + mynumber);

		PhoneNumber mynumber2 = new PhoneNumber("800-46FEDEX");
		System.out.println("the number is: " + mynumber2);

		PhoneNumber mynumber3 = new PhoneNumber("800-&*(^&%@");
		System.out.println("the number is: " + mynumber3);

		PhoneNumber mynumber = new PhoneNumber("800-GOFEDEX");
		System.out.println("the number is: " + mynumber);

		mynumber = new PhoneNumber(800, 1234567, 123);
		System.out.println("the number is: " + mynumber);

		mynumber2 = new PhoneNumber(7654321);
		System.out.println("the number is: " + mynumber2);
		if (mynumber.equals(mynumber2))
		    System.out.println("my number and mynumber2 are the same");
		else
		    System.out.println("my number and mynumber2 are different");

		 mynumber = new PhoneNumber();
		 System.out.println("the number is: " + mynumber);

	 }

}



public class PhoneNumber {
    private int areacode;
    private int number;
    private int ext;

    PhoneNumber() {
    areacode = 0;
    number = 0;
    ext = 0;
    }

    PhoneNumber(int newnumber) {
    areacode = 216;
    number = newnumber;
    }

    PhoneNumber(int newarea, int newnumber, int newext) {
		areacode = newarea;
		number = newnumber;
		ext = newext;
		ToString();
	}


    PhoneNumber(String newnumber) {

    String[] str = newnumber.split("-");

    //1. convert the areacode to int and then assign the value to the data field
    Integer.parseInt(String str[0]);
    System.out.print(str[0]+ "-");
    for (int i = 0; i < str[1].length(); i++) {
        if (Character.isLetterOrDigit(str[1].charAt(i))) {
            if (Character.isDigit(str[1].charAt(i))) {

			else
			    System.out.print(decode(str[1].charAt(i)));

		}
	}
    }

    private String decode(char c) {
        switch (c) {
            case 'A': case 'B': case 'C': return "2";
            case 'D': case 'E': case 'F': return "3";
            case 'G': case 'H': case 'I': return "4";
            case 'J': case 'K': case 'L': return "5";
            case 'M': case 'N': case 'O': return "6";
            case 'P': case 'Q': case 'R': case 'S': return "7";
            case 'T': case 'U': case 'V': return "8";
            case 'W': case 'X': case 'Y': case 'Z': return "9";
            default: return "";
        }
        }

        public boolean equals(PhoneNumber pn) {
           if (pn == number) {
			   return true;
		   else
		       return false;
		   }
        }

        public String toString() {
            if (ext = 0) {
			    System.out.print(areacode + "-" + number);
			else
			    System.out.print(areacode + "-" + number + " ext " + ext);
			}
        }
