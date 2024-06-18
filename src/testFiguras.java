public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		Rectangulo r1 = new Rectangulo("Casa", 11.5, 11.5);
		Rombo r2 = new Rombo("Diamante", 12.1, 10.2, 12.1);
		Romboide r3 = new Romboide("Papalote", 5.2, 2.0);
		Trapecio t3 = new Trapecio("Mesa", 10.3, 9.5, 10.3, 9.5);
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1); imprimirCalculo(r1);
		imprimirCalculo(r2); imprimirCalculo(r3);
		imprimirCalculo(t3);
	}//main
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras