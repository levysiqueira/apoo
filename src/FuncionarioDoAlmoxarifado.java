public class FuncionarioDoAlmoxarifado extends Funcionario {
  private String email;

  public FuncionarioDoAlmoxarifado(String email) {
    super(Almoxarifado.INSTANCIA);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void avisa(Solicitacao s) { 
    Mailer.envia(s, getEmail());
  }
}
