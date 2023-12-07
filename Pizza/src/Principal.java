import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<String, Integer> meuHashMap = new HashMap<>();
		 
		 Pizza m1 = new Pizza("queijo", 5);
		 m1.adicionaIngrediente(m1.chave, m1.qtde);
		 
		 Pizza m2 = new Pizza("camarao", 2);
		 m2.adicionaIngrediente(m2.chave, m2.qtde);
		 
		 Pizza m3 = new Pizza("presunto", 5);
		 m3.adicionaIngrediente(m3.chave, m3.qtde);
		 
		 Pizza.imprimir();
	}
}
