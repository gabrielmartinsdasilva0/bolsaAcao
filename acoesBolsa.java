package projetoIniciantes;
import java.util.Scanner;
public class bolsaValores {

public static void main(String[]args) {
	Scanner sn = new Scanner(System.in);
	double total1,total2,total3,total4,maior,menor;
	total1=0;
	total2=0;
	total3=0;
	total4=0;
	
	double media1,media2,media3,media4,mediafinal;
	media1=0;
	media2=0;
	media3=0;
	media4=0;
	
	double semana1 [] = new double[7];
	double semana2 [] = new double[7];
	double semana3 [] = new double[7];
	double semana4 [] = new double[7];
	
	String [] dias = new String[7];
			  dias[0]="Segunda-Feira";
			  dias[1]="Terça-Feira";
			  dias[2]="Quarta-Feira";
			  dias[3]="Quinta-Feira";
			  dias[4]="Sexta-Feira";
			  dias[5]="Sábado";
			  dias[6]="Domingo";
	
	System.out.println("---Bolsa de Valores---");
	
	System.out.println("===Vamos para a 1º semana===");
	for(int i=0; i<=6; i++) {
		System.out.print(dias[i]+": R$ ");
		semana1[i] = sn.nextDouble();
		total1=total1+semana1[i];
		media1=total1/7;
	}
	System.out.println("\n");
	
	System.out.println("===Vamos para a 2º semana===");
	for(int i=0; i<=6; i++) {
		System.out.print(dias[i]+": R$ ");
		semana2[i] = sn.nextDouble();
		total2=total2+semana2[i];
		media2=total2/7;
	}
	System.out.println("\n");
	
	System.out.println("===Vamos para a 3º semana===");
	for(int i=0; i<=6; i++) {
		System.out.print(dias[i]+ ": R$ ");
		semana3[i] = sn.nextDouble();
		total3=total3+semana3[i];
		media3=total3/7;
	}
	System.out.println("\n");
	
	System.out.println("===Vamos para a 4º semana===");
	for(int i=0; i<=6; i++) {
		System.out.print(dias[i]+ ": R$ ");
		semana4[i] = sn.nextDouble();
		total4=total4+semana4[i];
		media4=total4/7;
	}
	
	mediafinal=(media1+media2+media3+media4)/4;
	
	maior=0;
	menor=media1;
	
	double mediaM [] = new double[4];
		   mediaM[0]=media1;
		   mediaM[1]=media2;
		   mediaM[2]=media3;
		   mediaM[3]=media4;
	
		   for(int j=0; j<mediaM.length; j++) {
			   if(mediaM[j]>maior){
				   maior=mediaM[j];			   
			   }
		   }
		   for(int j=0; j<mediaM.length; j++) {
			   if(menor>mediaM[j]){
				   menor=mediaM[j];			   
			   }
		   }
		  
		   
		   
	
	System.out.println("\n");
	System.out.println(" A média dos valores da 1º semana: "+media1);
	System.out.println(" A média dos valores da 2º semana: "+media2);
	System.out.println(" A média dos valores da 3º semana: "+media3);
	System.out.println(" A média dos valores da 4º semana: "+media4);
	System.out.println("\n");
	System.out.println(" A média do Mês foi de R$ "+mediafinal);
	System.out.println(" A maior media do Mês foi de R$ "+maior);
	System.out.println(" A menor media  do Mês foi de R$ "+menor);
}
}
