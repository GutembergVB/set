package aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Set<LogEnter> lista = new HashSet<>();
		
		
		System.out.print("Quanto alunos no curso A? ");
		 int curso = sc.nextInt();
		  System.out.println("Código do aluno: ");
    for (int i = 1; i <= curso; i++) {
			int codigo = sc.nextInt();
			lista.add(new LogEnter(codigo));
	}
        System.out.print("Quanto alunos no curso B? ");
	     curso = sc.nextInt();
	      System.out.println("Código do aluno: ");
    for (int i = 1; i <= curso; i++) {
		  int codigo = sc.nextInt();
		   lista.add(new LogEnter(codigo));
    }
        System.out.print("Quanto alunos no curso B? ");
         curso = sc.nextInt();
          System.out.println("Código do aluno: ");
    for (int i = 1; i <= curso; i++) {
	      int codigo = sc.nextInt();
	       lista.add(new LogEnter(codigo));
    }	
		        sc.close();
		
		System.out.println("Total de Alunos " + lista.size());

	}

}
