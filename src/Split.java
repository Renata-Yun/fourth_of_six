public class Split
{
    public static String split(String s)
    {
        char[] str= s.toCharArray();
        String end="";
        int brac=0; //кол-во открытых скобок
        char openBrac='(';
        char closeBrac=')';

        for (int i=0; i<s.length();++i)
        {
            if (str[i]==openBrac)
            {
                brac++;
                end+=str[i];
            }
            if (str[i]==closeBrac)
            {
                brac--;
                end += str[i];
            }
            if (brac==0) //если нашли готовый кластер
            {
                if (i!=s.length()-1) //если не последний кластер
                    end+=", ";
            }
        }
        return end;
    }
}