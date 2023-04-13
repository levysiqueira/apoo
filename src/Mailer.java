public class Mailer {
  public static void envia(Solicitacao s, String email) {
    System.out.println("Enviando: " + s.toString() + " para " + email);
  }
}
