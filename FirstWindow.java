
package Football_GIT1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by KaZimad on 12.01.14.
 */
public class FirstWindow  {
    public static Object means[][];
    static Object[]heads={"Команда","Игры","Голы","Поражения","Очки"};  // масив заголовков

    public static void scaner (Scanner aScanner) throws IOException {


        Scanner list = new Scanner(new File("List.txt")); // проверить, где он.
        for (int i=0; list.hasNext(); i++){
            for (int j=0;list.hasNext();j++){  // надо учесть что  изначально было написано for (int j=0;means.lengtu;++j){


                means[i][j]=list.next();}


        }
    }
}
