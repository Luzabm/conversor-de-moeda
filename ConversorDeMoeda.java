package conversor_de_moeda;

import java.util.Scanner;

public class Conversor_de_Moeda {
	public static void main(String[] args) {
		System.out.println("Escolha '1' para converter a quantidade de dinheiro em Real para todas as moedas disponíveis no programa");
		System.out.println("Escolha '2' para converter a quantidade de dinheiro em Dólar para todas as moedas disponíveis no programa");
		System.out.println("Escolha '3' para converter a quantidade de dinheiro em Euro para todas as moedas disponíveis no programa");
		System.out.println("Escolha '4' para converter a quantidade de dinheiro em Libra para todas as moedas disponíveis no programa");
		System.out.println("Escolha '5' para converter a quantidade de dinheiro em Yuan para todas as moedas disponíveis no programa");
		System.out.println();
		try (Scanner num = new Scanner(System.in)){
			System.out.println("Digite o número escolhido: ");
			int escolha = num.nextInt();
			System.out.println("Digite a quantidade desejada: ");
			double quantidade = num.nextDouble();
			System.out.println();
			switch (escolha){
				case 1:
					Real_para_outro(quantidade);
					break;
				case 2:
					Dólar_para_outro(quantidade);
					break;
				case 3:
					Euro_para_outro(quantidade);
					break;
				case 4:
					Libra_para_outro(quantidade);
					break;
				case 5:
					Yuan_para_outro(quantidade);
					break;
				default:
					System.out.println("Escolha entre os números 1, 2, 3, 4 e 5: ");
			}
			
		}
	}
	public static void Real_para_outro(double quant) {
		System.out.println("1 real equivale a " + 0.19 + " Dólar(Dólares)");
		System.out.println();
		System.out.println(quant+" Real(Reais) equivale a " + (quant*0.19) +" Dólar(Dólares)");
		System.out.println();
		
		System.out.println("1 real equivale a " + 0.17 + " Euro(Euros)");
		System.out.println();
		System.out.println(quant+" Real(Reais) equivale a " + (quant*0.17) +" Euro(Euros)");
		System.out.println();
		
		System.out.println("1 real equivale a " + 0.14 + " Libra(Libras)");
		System.out.println();
		System.out.println(quant+" Real(Reais) equivale a " + (quant*0.14) +" Libra(Libras)");
		System.out.println();
		
		System.out.println("1 real equivale a " + 1.35 + " Yuan(Yuans)");
		System.out.println();
		System.out.println(quant+" Real(Reais) equivale a " + (quant*1.35) +" Yuans(Yuans)");
		System.out.println();
	}
	public static void Dólar_para_outro(double quant) {
		System.out.println("1 dólar equivale a " + 5.10 + " Real(Reais)");
		System.out.println();
		System.out.println(quant+" Dólar(Dólares) equivale a " + (quant*5.10) +" Real(Reais)");
		System.out.println();
		
		System.out.println("1 dólar equivale a " + 0.92 + " Euro(Euros)");
		System.out.println();
		System.out.println(quant+" Dólar(Dólares) equivale a " + (quant*0.92) +" Euro(Euros)");
		System.out.println();
		
		System.out.println("1 dólar equivale a " + 0.78 + " Libra(Libras)");
		System.out.println();
		System.out.println(quant+" Dólar(Dólares) equivale a " + (quant*0.78) +" Libra(Libras)");
		System.out.println();
		
		System.out.println("1 dólar equivale a " + 7.28 + " Yuan(Yuans)");
		System.out.println();
		System.out.println(quant+" Dólar(Dólares) equivale a " + (quant*7.28) +" Yuan(Yuans)");
		System.out.println();
	}
	public static void Euro_para_outro(double quant) {
		System.out.println("1 euro equivale a " + 5.84 + " Real(Reais)");
		System.out.println();
		System.out.println(quant+" Euro(Euros) equivale a " + (quant*5.84) +" Real(Reais)");
		System.out.println();
		
		System.out.println("1 euro equivale a " + 1.08 + " Dólar(Dólares)");
		System.out.println();
		System.out.println(quant+" Dólar(Dólares) equivale a " + (quant*1.08) +" Dólar(Dólares)");
		System.out.println();
		
		System.out.println("1 euro equivale a " + 0.84 + " Libra(Libras)");
		System.out.println();
		System.out.println(quant+" Euro(Euros) equivale a " + (quant*0.84) +" Libra(Libras)");
		System.out.println();
		
		System.out.println("1 euro equivale a " + 7.88 + " Yuan(Yuans)");
		System.out.println();
		System.out.println(quant+" Euro(Euros) equivale a " + (quant*7.88) +" Yuan(Yuans)");
		System.out.println();
	}
	public static void Libra_para_outro(double quant){
		System.out.println("1 libra esterlina equivale a " + 6.93 + " Real(Reais)");
		System.out.println();
		System.out.println(quant+" Libra(Libras) equivale a " + (quant*6.93) +" Real(Reais)");
		System.out.println();
		
		System.out.println("1 libra esterlina equivale a " + 1.28 + " Dólar(Dólares)");
		System.out.println();
		System.out.println(quant+" Libra(Libras) equivale a " + (quant*1.28) +" Dólar(Dólares)");
		System.out.println();
		
		System.out.println("1 libra esterlina equivale a " + 1.19 + " Euro(Euros)");
		System.out.println();
		System.out.println(quant+" Libra(Libras) equivale a " + (quant*1.19) +" Euro(Euros)");
		System.out.println();
		
		System.out.println("1 libra esterlina equivale a " + 9.35 + " Yuan(Yuans)");
		System.out.println();
		System.out.println(quant+" Libra(Libras) equivale a " + (quant*9.35) +" Yuan(Yuans)");
		System.out.println();
	}
	public static void Yuan_para_outro(double quant){
		System.out.println("1 yuan equivale a " + 0.74 + " Real(Reais)");
		System.out.println();
		System.out.println(quant+" Yuan(Yuans) equivale a " + (quant * 0.74) +" Reais(Reais)");
		System.out.println();
		
		System.out.println("1 yuan equivale a " + 0.14 + " Dólar(Dólares)");
		System.out.println();
		System.out.println(quant+" Yuan(Yuans) equivale a " + (quant * 0.14) +" Dólar(Dólares)");
		System.out.println();
		
		System.out.println("1 yuan equivale a " + 0.11 + " Libra(Libras)");
		System.out.println();
		System.out.println(quant+" Yuan(Yuans) equivale a " + (quant * 0.11) +" Libra(Libras)");
		System.out.println();
		
		System.out.println("1 yuan equivale a " + 0.13 + " Euro(Euros)");
		System.out.println();
		System.out.println(quant+" Yuan(Yuans) equivale a " + (quant * 9.35) +" Euro(Euros)");
		System.out.println();
	}
}
