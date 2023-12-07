import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
	
	String chave;
	int qtde;
	
	double precoUnitario;
	double valorPizza = 0;
	
    static int qtdeTotal = 0;
    
	private static HashMap<String, Integer> map = new HashMap<>();
	
	public Pizza(String chave, int qtde) {
		
		this.chave = chave;
		this.qtde = qtde;
	}
	  
	public void adicionaIngrediente(String chave, int qtde) {
		
		Pizza.contabilizaIngrediente(chave, qtde);	
	}
	
	public static void contabilizaIngrediente(String chave, int qtde) {

		if (!map.containsKey(chave))	{
			
			map.put(chave, qtde);
			
		}else {
			
			map.put(chave, qtde + map.get(chave));
		}
		
		qtdeTotal += qtde;
	}
	
	public static void imprimir() {
		
		for (String key : map.keySet()) {
				
			System.out.println(key + " qtde="+map.get(key));
		}   
		
		System.out.println(" qtdeTotal="+qtdeTotal);
	}
	
	public double getPreco(int qtde) {
		
		valorPizza = precoUnitario * qtde;
		
		if (qtde <= 2) {
			precoUnitario = 15;
		}else if (qtde <=5) {
			precoUnitario = 20;
		}else {
			precoUnitario = 23;
		}
		
		System.out.println("valor="+ valorPizza);
		
		return valorPizza;
	}
}
