import java.util.Scanner;
class L9E2{
  public int calculateDifference(int n){
    int sum = 0;
    int sumOfSquares = 0;
    for(int i = 1 ; i <= n;i++){
      sumOfSquares = sumOfSquares + i*i;
      sum = sum + i;
    }
    sum = sum * sum;
    return sumOfSquares - sum;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    L9E2 e = new L9E2();
    System.out.println(e.calculateDifference(n));
  }
}
