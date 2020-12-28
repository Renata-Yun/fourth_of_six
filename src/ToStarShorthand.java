public class ToStarShorthand
{
    public static String shorthand(String s)
    {
        String ans = "";
        char word = s.charAt(0);  //текущая буква
        int cnt = 0; //счетчик подряд идущих одинаковых букв

        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i)==word)  //если буква идентична предыдущей, то увеличиваем счетчик
                cnt++;
            else   //иначе сбрасываем счетчик до 1, меняем проверяемую букву и пишем в ответ букву (если надо то "*"+ cnt)
            {
                if (cnt>1)
                    ans+=word + "*" + cnt;
                else
                    ans+=word;
                cnt=1;
                word=s.charAt(i);
            }
            if (i==s.length()-1)
                if (cnt>1)
                    ans+=word + "*" + cnt;
                else
                    ans+=word;
        }
        return ans;
    }
}
