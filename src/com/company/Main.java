

public class Main {

    public static void main(String[] args) {
        int num[] = new int [10];
        for (int i = 0; i <= num.length; i++) {
            num[i - 1] = 2 * i;
        }
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + "");
        }
        }
    }