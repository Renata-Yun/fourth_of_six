public class Trouble
{
    public static boolean trouble(String num1, String num2)
    {
        char number = ' '; //текущая проверяемая цифра
        int cnt = 0; //счетчик подряд идущих цифр
        boolean done = false; //возвращаемый флаг функции

        for (int i = 0; i < num1.length(); ++i) //бежим по первому числу
        {

            if (num1.charAt(i) != number)  //если цифра не идентична предыдущей, то меняем проверяемую цифру на текущую
            {
                number = num1.charAt(i);
                cnt = 1;
            }
            else
                cnt++;
            if (cnt == 3) //если нашли нужную последовательность, то выходим из цикла
                break;
        }
        if (cnt == 3) //если нашли нужную последовательность в первом числе, заходим внутрь
        {
            cnt = 0; //чистим счетчик от предыдущих работ
            for (int i = 0; i < num2.length(); i++) //бежим по второму числу (для инструкции смотри предыдущий цикл)
            {
                if (num2.charAt(i) == number)
                    cnt++;
                else
                    cnt = 0;
                if (cnt == 2)
                {
                    done = true;
                    break;
                }
            }
        }
        return done;
    }
}