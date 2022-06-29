import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double massa = 0;
		double altura = 0;
		double imc = 0;

		System.out.println("Informe sua altura:");
		altura = input.nextDouble();

		System.out.println("Informe seu peso:");
		massa = input.nextDouble();

		imc = massa / (altura * altura);

		if (imc < 18.5) {

			System.out.println("Seu imc: " + imc + " (Magresa)");
		}

		else if (imc >= 18.5 && imc <= 24.9) {

			System.out.println("Seu imc: " + imc + " (Saud�vel)");
		} else if (imc >= 25.0 && imc <= 29.9) {

			System.out.println("Seu imc: " + imc + " (Sobrepeso)");
		} else if (imc >= 30.0 && imc <= 34.9) {

			System.out.println("Seu imc: " + imc + " (Obesidade Grau I)");
		} else if (imc >= 35.0 && imc <= 39.9) {

			System.out.println("Seu imc: " + imc + " (Obesidade Grau II - Severa)");
		}

		else {
			System.out.println("Seu imc: " + imc + " (Obesidade Grau III - Morbida)");
		}

	}

}
