package Day8;

public class Compare {

	public static void main(String[] args) {
		String s1="Mahindra"; // a,b,c,...z
		String s2="Honda";// a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p
		String s3="Mahindra";
		String s4="Hope";
		System.out.println(s1.compareTo(s3));//0 (equal)
		System.out.println(s1.compareTo(s2));//5 s1>s2
		System.out.println(s2.compareTo(s1));//-5  s2<s1
		System.out.println(s2.compareTo(s4)); //-2 because s2<s4
		System.out.println(s4.compareTo(s2));//2
	}

}
