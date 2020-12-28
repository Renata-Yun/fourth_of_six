public class OverTime
{
    public static String overTime(double start, double end, double pay, double factor)
    {
        double normalTime=0; //время обычной работы
        double overTime=0; //время сверхурочной работы
        double payment=0;

        if (17-end>=0) // проверка на сверхурочное время
            normalTime=end-start;
        else
        {
            normalTime=17-start;
            overTime=end-17;
        }
        payment= (normalTime*pay) + (overTime*factor*pay); //смотрим зарплату
        return String.format("%.2f", payment); //форматируем строку до 2 знаков посел ","
    }
}