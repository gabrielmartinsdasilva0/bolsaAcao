package primeiroProjeto;
import java.util.Scanner;
public class acoesBolsa {

public static void main(String[]args) {

	/*Em um processo seletivo para trainee em uma fintech, foi solicitada a 
	cria��o de um programa que permita calcular as m�dias dos valores de a��es na bolsa ao longo de um m�s.
	Nesse caso, considere que os meses t�m 28 dias e quatro semanas.
	O programa deve apresentar as m�dias semanais (a menor e maior) e mensal.
	Trabalhe esse c�digo em seu IDE, suba ele para sua conta no GitHub e 
	compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analis�-lo.*/

	Scanner sn = new Scanner(System.in);
	
	double maior,menor,total,valor;
	int dias =7;
	
	double vetor1[] = new double[7];
	double vetor2[] = new double[7];
	double vetor3[] = new double[7];
	double vetor4[] = new double[7];
	double total []  = new double[100];

	for(int m=0; m<1; m++) {
	
	for(int i=0; i<dias; i++) {
		System.out.print("Digite o valor da Ac�o : ");
		vetor1[i]= sn.nextInt();
		valor=vetor1[i];
	}
		System.out.println("Vamos para a segunda Semana");
		
		for(int i=0; i<dias; i++) {
			System.out.print("Digite o valor da Ac�o : ");
			vetor2[i]= sn.nextInt();
			valor=+vetor2[i];
		}
			System.out.println("Vamos para a Terceira Semana");
			
			for(int i=0; i<dias; i++) {
				System.out.print("Digite o valor da Ac�o : ");
				vetor3[i]= sn.nextInt();
				valor=+vetor3[i];
				}
				System.out.println("Vamos para a 4 Semana");
				
				for(int i=0; i<dias; i++) {
					System.out.print("Digite o valor da Ac�o : ");
					vetor4[i]= sn.nextInt();
					valor=+vetor4[i];
					total[i]=valor;
				}
				
			System.out.println(total);
				}

}

}
	
