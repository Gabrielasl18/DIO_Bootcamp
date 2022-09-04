package CollectionsJavaTeste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StremAPI {
	public static void main(String[] args) {
	List<Gato> meusGatos = new ArrayList<>() {{
		add(new Gato("Jon",19,"preto"));
		add(new Gato("Juju",4,"branca"));
		add(new Gato("Simba",6,"tigrado"));
		}};
		/*CLASSE AN�NIMA - classe que n�o recebeu um nome e �
		 * tanto declarado e instanciado em uma �nica instru��o.(Considere o uso dessa classe semrpe que precisar criar uma classe
		 * que ser� instanciada apenas uma vez)*/
		meusGatos.sort(new Comparator<Gato>(){
			public int compare(Gato g1, Gato g2) {
				return Integer.compare(g1.getIdade(), g2.getIdade());
			}
		});
		/*FUN��O LAMBDA - uma fun��o sem declara��o, isto �, n�o � necess�ria colocar um nome, um tipo de retorno e o modificador
		 * de acesso.A ideia � que o m�todo seja declarado no mesmo lugar em que ser� usado. As fun��es lambda em java tem a sintaxe
		 * definida como (argumento) -> (corpo)
		 * Lambda � "simplificar uma classe an�nima"
		*/
		meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));

		/*REFERENCE METHOD - novo recurso java 8, permite fazer refer�ncia a um m�todo ou construtor de uma classe(de forma funcional)
	  	 * e assim indicar que ele deve ser utilizado num ponto espec�fico do c�digo, deixando-o mais simples e leg�vel.Para utiliz�-lo
	  	 * basta informar uma classe ou refer�ncia seguida do s�mbolo "::" e o nome do m�todo sem os par�nteses no final.*/
		meusGatos.sort(Comparator.comparing(Gato::getNome));
	}	
		/* STREAMS API - traz uma nova op��o para a manipula��o de cole��es em Java seguindo os princ�pios da programa��o funcional.
		 * Combinada com as express�es lambda, ela proporciona uma forma diferente de lidar com conjuntos de elementos,
		 * oferecendo ao desenvolvedor uma maneira simples e concisa de escrever c�digo que resulta em facilidade de 
		 * manuten��o e paraleliza��o sem efeitos indesejados em tempo de execu��o.
		 *
		 * SOURCE -> PIPELINE -> TERMINAL
		 *(estrutura de uma streams
		 *)
		 */

}
class Gatos  { //interface Comparable obriga a criar o CompareTo
	private String nome;
	private Integer idade;
	private String cor;
	public Gatos(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
