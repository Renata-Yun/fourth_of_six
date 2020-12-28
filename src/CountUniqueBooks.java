import java.util.HashSet;
import java.util.Set;

public class CountUniqueBooks
{
    public static int count(String books, String current)
    {
        books=books.toUpperCase();
        current=current.toUpperCase(); //символ начала/конца книги
        boolean begin=false; //флаг начала/завершения книги
        Set<Character> set= new HashSet<>(); //коллекция книг

        for (int i=0; i<books.length(); ++i)
        {
            if (books.charAt(i)==current.charAt(0)) //меняем значение флага при нахождении символа current
                begin=!begin;
            else
            {
                if (begin) //если книга открыта, то добавляем в коллекцию уникальные книги
                    set.add(books.charAt(i));
            }
        }
        return set.size();
    }
}

