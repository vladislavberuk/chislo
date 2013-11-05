import java.util.Random;
import java.util.Scanner;



public class GuessNumber {
    public static void main(String[] args) {
        GuessLogic guessLogic = new  GuessLogic();
        GuessInterface userInterface = new GuessInterface();

        // 1. Научиться получить случайное число
        // Ctrl - Q



        // 2. Попросить у пользователя число и
        // прочитать с консоли


        // 3. Проверить число и указать больше оно или меньше нужного
        // if( ... ) { /* выдать сообщение о победе */}
        //    else { /*выдать сообщение о больше/меньше */ } `

        int secret = guessLogic.generateSecretNumber();

        System.out.println("Случайное число: " + secret + '\n');

        guessLogic.work();


        // 4. Научиться повторять действия 2-3 в цикле
        //    while(...) {/* делаем действия 2 и 3*/}




        // 5. Когда цикл закончился - выдать правильный ответ
        //    System.out.println
    }
}
