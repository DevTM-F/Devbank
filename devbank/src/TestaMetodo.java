
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoLuan = new Conta();
		contaDoLuan.saldo = 100;
		contaDoLuan.deposita(50);
		System.out.println(contaDoLuan.saldo);
		
		boolean conseguiuRetirar = contaDoLuan.saca(20);
		System.out.println(contaDoLuan.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucesso = contaDaMarcela.transfere(300, contaDoLuan);
		if(sucesso) {
			System.out.println("Sucesso");
		} else {
			System.out.println("sem saldo");
		}
		System.out.println("Saldo do Luan: " + contaDoLuan.saldo);
		System.out.println("saldo da marcela: " + contaDaMarcela.saldo);
		
		contaDoLuan.titular = "Luan Santos";
		System.out.println(contaDoLuan.titular);
	}
}
