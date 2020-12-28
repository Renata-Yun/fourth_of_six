public class Bugger
{
    public static int bugger(int n)
    {
        int cnt = 0; //кол-во повторений разложения числа
        int sum = 1; //перемножение цифр числа (так нада)
        boolean done = false; //флаг завершения функции

        while (!done)
        {
            if (n< 10) //проверяем число на завершение цикла
                done = true;
            else
            {
                sum=1;
                cnt++;
                while (n != 0) //вытаскиваем цифры из числа и перемножаем
                {
                    sum *= n % 10;
                    n /= 10;
                }
                n = sum; //для повторения цикла до завершения без лишнего кода
            }
        }
        return cnt;
    }
}