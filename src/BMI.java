public class BMI
{
    public static String bMI(String str1, String str2)
    {
        double mas = Double.parseDouble(toDouble(str1)); //выдергиваем массу из строки
        double len = Double.parseDouble(toDouble(str2)); //выдергиваем рост из строки
        double index = 0;

        if (str1.contains("p"))  //переводим в нужную величину (кг-м)
            mas *= 0.4535;
        if (str2.contains("i"))
            len *= 0.0254;

        index = mas / (len * len);

        String ans = String.format("%.1f", index); //вывод с одним знаком после точки

        if (index > 24.9)
        {
            return (ans + " overweight");
        }
        else
        {
            if (index < 18.5)
            {
                return (ans + " underweight");
            }
            else
            {
                return (ans + " Normal weight");
            }
        }
    }

    public static String toDouble(String s)
    {
        String ans = "";
        char dec = '.';

        for (int i = 0; i < s.length(); ++i)
        {
            if (Character.isDigit(s.charAt(i)))
                ans += s.charAt(i);
            else if (s.charAt(i) == dec)
                ans += s.charAt(i);
            else
                break;
        }
        return ans;
    }
}