
public class TestaReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		
		System.out.println(controle.getSoma());
		
		String nome = g1.getNome();		
		System.out.println(nome);
	}
}
