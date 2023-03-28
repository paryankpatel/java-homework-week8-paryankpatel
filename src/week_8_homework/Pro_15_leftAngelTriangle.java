package week_8_homework;

//15. Display left angle triangle of * using nested for loops

public class Pro_15_leftAngelTriangle {

    public static void main(String[] args) {
       Pro_15_leftAngelTriangle obj = new Pro_15_leftAngelTriangle();
        obj.printPattern(5);

    }
    private void printPattern(int a)
    {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a; j++) {
                System.out.print(( j >= i ? "* " : "  "));
            }
            System.out.println();
        }
    }
}
