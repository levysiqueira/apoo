import java.util.Collection;
import java.util.HashMap;

public class Almoxarifado extends Area {
  private static final double QUOTA = 1000.0;
  public static final Almoxarifado INSTANCIA = new Almoxarifado();
  private HashMap<Integer, Material> materiais;
  private FuncionarioDoAlmoxarifado funcionario;
  
  private Almoxarifado() {
    super(QUOTA);
    materiais = new HashMap<Integer, Material>();
    materiais.put(1, new Material(1, "papel A4", 15));
    materiais.put(2, new Material(2, "caneta azul", 6));
    materiais.put(3, new Material(3, "lapis", 3));
    materiais.put(4, new Material(4, "borracha", 4));
  }

  public Collection<Material> getMateriais() {
    return materiais.values();
  }

  public void setFuncionario(FuncionarioDoAlmoxarifado f) {
    this.funcionario = f;
  }

  public Material getMaterial (int id) {
    return materiais.get(id);
  }

  public void avisa(Solicitacao s) {
    funcionario.avisa(s);
  }
}
