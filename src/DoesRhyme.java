public class DoesRhyme
{
    public static boolean rhyme(String s1, String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        String word1 = ""; //слово для проверки рифмы в первой строке
        String word2 = ""; //во второй строке
        String letters="aeiouаеёиоуыэюя"; //словарь гласных
        int[] words1 ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //счетчик гласных в первом слове
        int[] words2 ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //во втором слове
        boolean done=true;

        for (int i = s1.length() - 1; s1.charAt(i) != ' '; --i) //извлекаем последнее слово из первой строки
            if (Character.isLetter(s1.charAt(i)))
                word1 = s1.charAt(i) + word1;

        for (int i = s2.length() - 1; s2.charAt(i) != ' '; --i) //из второй
            if (Character.isLetter(s2.charAt(i)))
                word2 = s2.charAt(i) + word2;

        for (int i=0; i<word1.length();++i)  //отмечаем гласные в первом слове
        {
            for (int j=0; j<letters.length(); ++j)
            {
                if (word1.charAt(i)==letters.charAt(j))
                {
                    words1[j]++;
                    break;
                }
            }
        }

        for (int i=0; i<word2.length();++i) // во втором
        {
            for (int j=0; j<letters.length(); ++j)
            {
                if (word2.charAt(i)==letters.charAt(j))
                {
                    words2[j]++;
                    break;
                }
            }
        }

        for (int i=0; i<15; ++i) //сопостовляем счетчики
        {
            if (words1[i]!=words2[i])
            {
                done=false;
                break;
            }
        }
        return done;
    }
}
