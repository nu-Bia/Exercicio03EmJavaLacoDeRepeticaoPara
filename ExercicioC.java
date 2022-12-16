//c)    Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). 
package Exercicios;

import java.util.Scanner;

public class ExercicioC {
public static void main (String[]args) {
	
int soma = 0;

for(int i = 1; i<=100; i++)
	
soma += i;

System.out.print("A soma dos 100 primeiros números é: " + soma );
}}
