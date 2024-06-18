
public class Trapecio implements FiguraGeometrica {
	private String name;
	private double lado;
	private double altura;
	private double baseMenor;
	private double baseMayor;
	public Trapecio(String name, double lado, double altura, double baseMenor, double baseMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.altura = altura;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
	} // Constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	} // Getter and Setter
	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", lado=" + lado + ", altura=" + altura + ", baseMenor=" + baseMenor
				+ ", baseMayor=" + baseMayor + "]";
	} // To string
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getAltura() * (getBaseMayor() + getBaseMenor())/2);
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (getLado() + getLado() + getLado() + getLado() );
	}
	
	
	
	
	
	
	
}
