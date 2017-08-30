package CertificacaoArray;

public class TestaArray {
	public static void main(String[] args) {
		// declaração de arrays   
		// Array e um objeto
		//instancia do objeto 
		//double pesos[];
		//	long []numeros;
		//	long[]tamanhos;
		
		//int[] idades = new int []{0,2,4,6,8}; 
		int[] idades = {0,2,4,6,8};
		idades[3] = 10;
		
		// Cliente[] clientes = new Cliente[]{new Cliente(),null,new Cliente()}; // --> see how to print syso this array
		
		System.out.println(idades[4]);
		System.out.println("total de posições do array : " + "  " +idades.length);
		
		for(int i=0;i < idades.length;i++){
			System.out.println(i);
		}
		
		int j = 0;
		while(j < idades.length){
			System.out.println("this case is used while loop" + "  " + j);
			j++;
			
			
		}
		
		for(int idade : idades){
			System.out.println("this case is used forEach Java5 and so on  " + " " + idade); // this array is used only read.
			
		}
		
		Cliente[] clientes = new Cliente[10];
		for(int i = 0;i < clientes.length; i++){
			clientes[i] = new Cliente();
			clientes[i].nome = "israel";
		}
		
		for(Cliente c : clientes){
			System.out.println(c.nome);
		}
		
		Cliente clientes2[] = new Cliente[5];
		clientes2[0] = new Cliente();
		clientes2[1] = new ClienteEspecial();
		
		
		Cliente israel = new Cliente();
		israel.nome = "israel";
		clientes2[0] = israel;
		
		System.out.println(israel.nome);
		System.out.println(clientes2[0].nome);

		
		System.out.println(clientes[0].nome);
		
		israel.nome = "araujo";
		
		System.out.println(israel.nome);
		System.out.println(clientes2[0].nome);
		
		
		//int[] valores = new int[10];
		//long numeros[] = (long[]) valores;
		
		String[] nomes = {"bunda", "mole"};
		Object[] objetos;
		objetos = nomes;
		
		for(Object o : objetos){
			System.out.println(o);
		}
		
		
		int [][] tabela;
		int [][] cubo [];
		int [][] hipercubo[][];  // quatro dimensões 
		
		tabela = new int[10][5];
		cubo = new int [10][][];
		int [][] teste = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int [][] estranho = new int [2][];
		estranho[0] = new int [20];
		estranho[1] = new int [10];
		
		for(int i=0; i < estranho.length;i++){
			System.out.println(estranho[i].length);
		}
		

		
		
	
	}

}
