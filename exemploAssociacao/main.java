package relacionamentoEntreClasses.exemploAssociacao;

public class main {

	public static void main(String[] args) {
		Universidade universidade = new Universidade("USP");
		
		Estudante estudante = new Estudante ("João", universidade);
		
		System.out.println("Esudante: "+estudante.getNome()+"\nUniversidade: "+universidade.getNome());

	}

}
