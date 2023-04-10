// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    System.out.println("Insira o tamanho do arquivo em MB");
    Scanner teclado = new Scanner(System.in);
    double download = teclado.nextDouble(); 

     System.out.println("Insira a velocidade da sua internet");
    Scanner tecladoVelocidade = new Scanner(System.in);
    double velocidade = teclado.nextDouble(); 

    double tempoParaFinalizarDownload = ((download * velocidade) / 60);

    System.out.println("O tempo para download é: " + tempoParaFinalizarDownload);
  }
}