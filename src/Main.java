import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5]; // יצירת מערך דו מימדי בגודל 5x5
        Random rand = new Random(); // יצירת אובייקט רנדום ליצירת מספרים רנדומליים

        // מילוי המערך עם מספרים רנדומליים בין 1 ל-10
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(10) + 1; // מספר רנדומלי בין 1 ל-10
            }
        }

        // הדפסת המערך לצורך בדיקה
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
