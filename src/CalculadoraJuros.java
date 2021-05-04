
public class CalculadoraJuros {

	public static void main(String[] args) {
		
		double valor; //quantia em deposito ao fim de cada ano
		System.out.println("Digite o valor do depósito inicial: ");
		double principal = MyIO.readDouble(); //quantidade inicial antes dos juros
		System.out.println("Digite o valor da taxa de juros: ");
		double taxa = MyIO.readDouble(); //taxa de juros
		
		//exibe cabeçalhos
		
		System.out.printf("%s%20s %n", "Anos", "Total na conta");
		
		//calcula a quantidade do deposito para um dos dez anos
		for(int ano = 1; ano <= 10; ++ano) {
			
			valor = principal * Math.pow(1.0 + taxa, ano);
			
			System.out.printf("%4d%,20.2f%n", ano, valor);
		}

	}

}
