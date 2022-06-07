package aluno;

public class Aluno {

	private String nome, curso;
	private Double nota1, nota2, g1;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getG1() {
		return g1;
	}

	public void setG1(Double n1, Double n2) {
		this.g1 = (n1 + n2) / 2; 		 
	}

	@Override
	public String toString() {
		return "aluno [Nome= " + getNome()  + ", Curso= " + getCurso()
				+ ", Nota1= "  + getNota1() + ", Nota2= " + getNota2()
				+ ", G1= "     + getG1()    + "]";
	}
	
	
}
