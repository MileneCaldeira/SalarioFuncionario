import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
		System.out.println("Informe o número do funcionário: ");
	int NumF = sc.nextInt();
	
		System.out.println("Informe as horas trabalhadas: ");
	int HoraT = sc.nextInt();
	
		System.out.println("Informe quanto vale a hora: ");
	double ValorH = sc.nextDouble();
	
	double salario = HoraT*ValorH;
	
		System.out.printf("O funcionário número %d receberá %.2f de salário.", NumF, salario);
	}

}
