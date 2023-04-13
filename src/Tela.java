import static java.lang.System.out;

import java.util.Scanner;

public class Tela {
	private Scanner s;
	private Controlador c;

	public static void main(String[] args) {
		// Burocracia
    Area ti = new Area(300);
    Gerente gti = new Gerente(ti);
    ti.setResponsavel(gti);
    Funcionario f = new Funcionario(ti);
    FuncionarioDoAlmoxarifado fa = new FuncionarioDoAlmoxarifado("teste@teste.com");
    Almoxarifado.INSTANCIA.setFuncionario(fa);
    
    Tela t = new Tela(new Controlador(f));
		
		while (true) {
		  t.solicitaMaterial();
      t.selecionaMaterial();
		}
	}
	
	public Tela(Controlador c) {
		s = new Scanner(System.in);
		s.useDelimiter("\r\n|\n");
    this.c = c;
	}
	
	public void solicitaMaterial() {
		out.println("Materiais disponiveis: ");
		for(Material m : c.getMateriais())
			out.println(m.getCodigo() + " - " + m.getNome() + " R$" + m.getPreco());		
		out.println();
	}

  public void selecionaMaterial() {
    out.print("Material: ");
    int id = s.nextInt();
    out.print("Quantidade: ");
    int quantidade = s.nextInt();

    Solicitacao s = c.solicita(id, quantidade);
    out.println("Solicitacao criada: R$" +s.getValor());
    out.println("=======");
  }

}