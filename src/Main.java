import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int HORA_CHEIA = 24 * 3600;

		while (sc.hasNext()) {
			String linha = sc.nextLine();

			String[] split = linha.split(":");

			String hora = split[0];
			String minuto = split[1];
			String segundo = split[2];

			int valor = Integer.parseInt(hora) * 3600 + Integer.parseInt(minuto) * 60 + Integer.parseInt(segundo);

			System.out.println(HORA_CHEIA - valor);
		}
	}
}
