public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int f1 = Integer.valueOf(arg[0]);
		double f2 = Double.valueOf(arg[1]);
		double s = f1+f2;
		System.out.println("Сумма = " + s);
		s = f1*f2;
		System.out.println("Произведение = " + s);
		s = f1/f2;
		System.out.println("Частное = " + s);
		s = f1*f1*f1*f1*f1;
		System.out.println("Возведение в степень = " + s);
	}
}