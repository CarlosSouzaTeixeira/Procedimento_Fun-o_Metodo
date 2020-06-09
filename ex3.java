import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		
		Scanner leitor =new Scanner (System.in);
		Double n1, n2, n3,n4;
		
		System.out.print("Digite a primeira nota: ");
		n1 = leitor.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = leitor.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		n4 = leitor.nextDouble();
		
		
		boolean resultado = media(n1,n2,n3,n4);
		System.out.println(resultado);
		
		
	}
		public static boolean  media(Double n1, Double n2, Double n3, Double n4){
			
			Double media = ((n1+n2+n3+n4)/4);
		
		if(media>7)
			return true;
		else
			return false;
		
			
			
		} 
	

}
	