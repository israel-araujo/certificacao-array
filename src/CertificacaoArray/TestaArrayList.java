package CertificacaoArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TestaArrayList {
	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();

		nomes.add("java");
		nomes.add("python");
		nomes.add("scala");
		
		Iterator<String> it =  nomes.iterator();  // 
		
		while(it.hasNext()){
			String atual = it.next();
			
			System.out.println("percorre todos os elementos da coleção "  +"  "+ atual);
			// it.remove();
		}
		
		for(String nome : nomes){
			System.out.println("used enhanced for or forEach "  + "  " +  nome);
		}
		
		Cliente cli = new Cliente();
		cli.nome = "rael";
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		clientes.add(cli);
		
		cli.nome = "araujo";
		System.out.println(cli.nome);
		System.out.println(clientes.get(0).nome);
		
		

		System.out.println(nomes.contains("c#"));
		System.out.println(nomes);

		boolean removido = nomes.remove("spark");

		System.out.println(removido);
		
		System.out.println(nomes.size());
		
        Object[] objetos = nomes.toArray();
        
        String[] nomesArray = nomes.toArray(new String[nomes.size()]);  // converter array para string
        
        
        String[] nomesArray1 = nomes.toArray(new String[0]); // codigo enxuto  cria um novo array do mesmo tipo e tramanho
        
        
        
        ArrayList<String> paises = new ArrayList<>();
        
        paises.add("Brasil");
        paises.add("israel");
        paises.add("Ira");
        
        
        ArrayList<String> tudo = new ArrayList<>();
        
        
        tudo.addAll(nomes);
        tudo.addAll(paises);
        
        System.out.println(tudo.size());
        
        
        System.out.println(nomes.get(0));
        
        nomes.add(0,"php");
        
        System.out.println(nomes);
        
        
        nomes.remove("php");
        
        System.out.println(nomes.get(0));
        
        System.out.println(nomes);
        
        nomes.set(0,"spark");  // troca um elemento pelo outro
        
        nomes.add(0,"java");
        
        System.out.println(nomes);
        
        System.out.println(nomes.indexOf("java"));
        
        System.out.println(nomes.lastIndexOf("c#"));  // olha a ultima posição  do fim para o inici

        System.out.println(nomes.size());
	}
}
