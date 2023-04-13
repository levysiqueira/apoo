import java.util.Collection;

public class Controlador {
  private Funcionario f;
  
  public Controlador(Funcionario logado) {
    this.f = logado;
  }

  public Collection<Material> getMateriais() {
    return Almoxarifado.INSTANCIA.getMateriais();
  }

  public Solicitacao solicita(int id, int quantidade) {
    Material m = Almoxarifado.INSTANCIA.getMaterial(id);
    return f.solicita(m, quantidade);
  }
}