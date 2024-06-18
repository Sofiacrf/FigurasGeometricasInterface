
public class Rombo implements FiguraGeometrica {
	private String name;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	public Rombo(String name, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
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
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	} // Getter and Setter
	
	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	} // to String
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return ((getDiagonalMayor() * getDiagonalMenor()) / 2 );
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (4+getLado());
	}
	
}
