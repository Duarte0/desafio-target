public class atv5 {
  public static void main(String[] args) {
    String texto = "Olá, mundo!";
    String textoInvertido = inverterString(texto);
    System.out.println("Texto original: " + texto);
    System.out.println("Texto invertido: " + textoInvertido);
  }

  public static String inverterString(String texto) {
    String textoInvertido = "";
    for (int i = texto.length() - 1; i >= 0; i--) {
      textoInvertido += texto.charAt(i);
    }
    return textoInvertido;
  }
}
