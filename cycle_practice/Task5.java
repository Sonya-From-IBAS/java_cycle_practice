package cycle_practice;

//Написать скрипт, который выводит согласные буквы английского алфавита
//начиная с 'b' и выводит каждую букву  до тех пор, пока не встретит гласную
public class Task5 {
    public static void main(String[] args) {
        printLetters();
    }

    public static void printLetters() {
        for(char letter = 'b'; !isVowel(letter); letter++) {
            System.out.print(letter);
        }
    }

    public static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'w' || letter == 'y';
    }

}
