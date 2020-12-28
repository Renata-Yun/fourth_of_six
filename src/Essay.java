public class Essay
{
    public static String essay(int n, int k, String s)
    {
        char[] str=s.toCharArray();
        String word=""; //текущее слово
        String ans=""; //исправленное эссе
        int kol=0; //текущее наполнение строки
        int cnt=0; //кол-во символов слова

        for (int i=0; i<s.length();++i)
        {
            if(s.charAt(i)!=' ' && i!=s.length()-1) //если текущий символ продолжает слово и это не последний символ
                word += s.charAt(i);
            else
            {
                if (i==s.length()-1) //проверка на конец строки
                    word+=s.charAt(i);
                cnt=word.length(); // длина слова
                if (kol+cnt<=k) //если влезает в строку
                {
                    ans+=word+" ";
                    kol+=cnt;
                }
                else
                {
                    ans+='\n'+word+" "; //переносим слово на след строку
                    kol=cnt;
                }
                word="";
            }
        }
        return ans;
    }
}