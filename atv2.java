public class atv2 {
  public static void main(String[] args) {
    int numeroVerificar = 8; // Insira o número desejado aqui

    if (pertenceFibonacci(numeroVerificar)) {
      System.out.println("O número " + numeroVerificar + " pertence à Sequência de Fibonacci!");
    } else {
      System.out.println("O número " + numeroVerificar + " não pertence à Sequência de Fibonacci.");
    }
  }

  public static boolean pertenceFibonacci(int numero) {
    int a = 0, b = 1, c = a + b;
    while (a <= numero) {
      if (a == numero) {
        return true;
      }
      a = b;
      b = c;
      c = a + b;
    }
    return false;
  }
}
