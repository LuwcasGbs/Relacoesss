package relacionamentoEntreClasses.exercicios;

public class Main2 {

	public static void main(String[] args) {
		Livro livro = new Livro("Coraline","Paul Neiman");
		
		System.out.println("O livro "+livro.getTitulo() +" é do autor "+livro.getAutor());

	}

}
