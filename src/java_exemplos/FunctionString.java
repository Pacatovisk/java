package java_exemplos;

public class FunctionString {

	public static void main(String[] args) {
		
		String original = "MarcelO ViAnA dIas    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.substring(2);
		String s04 = original.substring(2,9);
		String s05 = original.trim();
		String s06 = original.replace('M','R');
		String s07 = original.replace("Mar", "Car");
		
		System.out.println("Original: -" +original+"-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("substring(2): -" + s03 + "-");
		System.out.println("substring(2,9): -" + s04 + "-");
		System.out.println("trim: -" + s05 + "-");
		System.out.println("replace('M', 'R'): -" + s06 + "-");
		System.out.println("replace('Mar','Car'): -" + s07 + "-");
		
	}

}
