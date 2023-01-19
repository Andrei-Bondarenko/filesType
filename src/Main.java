import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название файла: ");
        String fileName = sc.nextLine();
        System.out.println("Введите расширение файла: ");
        String fileType = sc.nextLine();
        String[] words = fileName.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        if (words.length <= 1) stringBuilder.append(fileName).append(".");
        else for (int i = 0; i < words.length-1; i++) {
            stringBuilder.append(words[i]).append(".");
        }
        stringBuilder.append(fileType);
        System.out.println(stringBuilder);
    }
}