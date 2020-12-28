public class ToCase
{
    public static String define(String s)
    {
        if (!s.contains("_")) //ищем нужный метод
            return Snake(s);
        else
            return Camel(s);
    }

    public static String Camel(String s)
    {
        String ans = "";
        for (int i = 0; i < s.length() - 1; ++i) //чтобы случайно не выйти за диапозон строки
        {
            if (s.charAt(i) == '_')
            {
                ans += Character.toUpperCase(s.charAt(i + 1)); //вставляем в строку нужный символ
                ++i;                                           //и сразу же уходим от него, т.к. его мы уже обработали
            }
            else
                ans+=s.charAt(i);
        }
        ans+=s.charAt(s.length()-1); //докидываем последний символ
        return ans;
    }

    public static String Snake(String s)
    {
        String ans = "";
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == Character.toUpperCase(s.charAt(i))) //проверяем на наличие следующего слова
            {
                ans+="_"+ Character.toLowerCase(s.charAt(i)); //вставляем разделяющий знак и букву
            }
            else
                ans+=s.charAt(i);
        }
        return ans;
    }
}