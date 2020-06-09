import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
        int x,y;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        x = leitor.nextInt();
        System.out.print("Digite o segundo número:");
        y = leitor.nextInt();
        System.out.print("Multiplicação: ");
        System.out.println(mult(x,y));   
    }
    public static int mult(int x,int y){
        int m = x*y;
        return m;
    }
    
}
