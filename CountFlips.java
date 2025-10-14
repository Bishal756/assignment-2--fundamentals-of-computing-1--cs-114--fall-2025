public class CountFlips {
  public static void main(String[] args) {

    int headcounts = 0;
    int tailcounts = 0;
    final int total_flips = 100;

      Coin coin = new Coin();

    for (int i =1; i<=total_flips; i++){
      coin.flip();

      if (coin.isHeads()){
        headcounts++;
      }
      else{
        tailcounts++;
      }
    }
    System.out.println("Here is the result:");
    System.out.println("Head: "+ headcounts);
    System.out.println("Tails " + tailcounts);
  }
}