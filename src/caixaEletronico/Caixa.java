package caixaEletronico;
import java.util.Scanner;

public class Caixa {
	
	public int nota200;
	public int nota100;
	public int nota50;
	public int nota20;
	public int nota10;
	public int nota5;
	public int nota2;
	public int nota1;
	public int valor;
	public Scanner Leitor = new Scanner(System.in);
	
	
	public void ObterValor() {
		System.out.println("digite o valor a ser sacado:");
		valor = Leitor.nextInt();
	}
	
	public void SepararNotas() {
		while(valor != 0) {

	        if (valor >= 200) {
	              valor = valor -200;
	              nota200 ++;}
	        
	        else if (valor >= 100) {
	              valor = valor -100;
	              nota100 ++;}
	        
	        else if (valor >= 50) {
	              valor = valor -50;
	              nota50 ++;}
	        
	        else if (valor >= 20) {
	              valor = valor -20;
	              nota20 ++;}
	        
	        else if (valor >= 10) {
	              valor = valor -10;
	              nota10 ++;}
	        
	        else if (valor >= 5) {
	              valor = valor -5;
	              nota5 ++;}
	         
	        else if (valor >= 2) {
	              valor = valor -2;
	              nota2 ++;}
	            	            
	        else if (valor >= 1) {
		          valor = valor -1;
		          nota1 ++;}

		}}
	
	public void ContadorNotas() {
		if(nota200>0) {
            System.out.println(nota200 + " x de R$200,00");}

             if(nota100>0) {
            System.out.println(nota100 + " x de R$100,00");}

             if (nota50>0) {
            System.out.println(nota50 + " x de R$50,00");}

             if (nota20>0) {
            System.out.println(nota20 + " x de R$20,00");}

             if (nota10>0) {
            System.out.println(nota10 + " x de R$10,00");}

             if (nota5>0) {
            System.out.println(nota5 + " x de R$5,00");}

             if(nota2>0) {
            System.out.println(nota2 + " x de R$2,00");}

             if (nota1>0) {
            System.out.println(nota1 + " x de R$1,00");}
	}
}
