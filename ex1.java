import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
        int x,y;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro n�mero:");
        x = leitor.nextInt();
        System.out.print("Digite o segundo n�mero:");
        y = leitor.nextInt();
        System.out.print("Multiplica��o: ");
        System.out.println(mult(x,y));   
    }
    public static int mult(int x,int y){
        int m = x*y;
        return m;
    }
    
}
