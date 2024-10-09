package relacionamentoEntreClasses.exercicios;

public class Main {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Marketing");
		Empresa empresa = new Empresa ("Twitter", departamento);
		
		System.out.println("A empresa: "+empresa.getNome()+" precisa de funcionários no departamento de "+departamento.getNome());

	}

}
