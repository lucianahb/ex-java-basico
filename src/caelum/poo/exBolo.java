package caelum.poo;

public class exBolo {

	public static void main(String[] args) {
		Bolo bolo = new Bolo();
		bolo.sabor = "Laranja";
		bolo.cobertura = "limão";
		bolo.pesoKg = 0.6;
		bolo.qtdeFatias = 2;
		
		bolo.topping = new String[4];
		bolo.topping[0] = "Confete";
		bolo.topping[1] = "Granulado";
		
		System.out.println("Venda bolo: " + bolo.sabor + ", " + bolo.topping[0] + ", " + bolo.pesoKg);
	}
}
