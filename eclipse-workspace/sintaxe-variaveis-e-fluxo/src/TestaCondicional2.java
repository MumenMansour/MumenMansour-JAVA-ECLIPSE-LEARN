
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testand condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado == true) {
			System.out.println("voce tem mais de 18 anos ou acompanhado de maiores");
			System.out.println("seja bem vindo ");
		}

		else {
			System.out.println("infelizmente voce nao pode entrar");

		}
	}

}
