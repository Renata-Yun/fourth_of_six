import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int x;
        int y;
        double a;
        double b;
        double c;
        double d;
        String str1="";
        String str2="";


        //1
        System.out.println("Введите кол-во слов в строке строке");
        x=scanner.nextInt();
        System.out.println("Введите кол-во символов на строке");
        y=scanner.nextInt();
        System.out.println("Введите строку");
        str1=scanner.nextLine();
        str1=scanner.nextLine();
        System.out.println(Essay.essay(x,y,str1));

        //2
        System.out.println("Введите строку скобок");
        str1=scanner.nextLine();
        System.out.println(Split.split(str1));

        //3
        System.out.println("Введите строку");
        str1=scanner.nextLine();
        System.out.println(ToCase.define(str1));

        //4
        System.out.println("Введите начало рабочего дня");
        a=scanner.nextDouble();
        System.out.println("Введите конец рабочего дня");
        b=scanner.nextDouble();
        System.out.println("Введите почасовую оплату");
        c=scanner.nextDouble();
        System.out.println("Введите сверхурочный множитель");
        d=scanner.nextDouble();
        System.out.println(OverTime.overTime(a,b,c,d));

        //5
        System.out.println("Введите вес и меру измерения(pounds/kilos)");
        str1=scanner.nextLine();
        System.out.println("Введите рост и меру измерения(inches/meters)");
        str2=scanner.nextLine();
        System.out.println(BMI.bMI(str1, str2));

        //6
        System.out.println("Введите число");
        x=scanner.nextInt();
        System.out.println(Bugger.bugger(x));

        //7
        System.out.println("Введите строку");
        str1=scanner.nextLine();
        System.out.println(ToStarShorthand.shorthand(str1));

        //8
        System.out.println("Введите первую строку");
        str1=scanner.nextLine();
        System.out.println("Введите вторую строку");
        str2=scanner.nextLine();
        System.out.println(DoesRhyme.rhyme(str1,str2));

        //9
        System.out.println("Введите первое число");
        str1=scanner.nextLine();
        System.out.println("Введите второе число");
        str2=scanner.nextLine();
        System.out.println(Trouble.trouble(str1,str2));

        //10
        System.out.println("Введите последовательность символов");
        str1=scanner.nextLine();
        System.out.println("Введите символ открытия/закрытия книги");
        str2=scanner.nextLine();
        System.out.println(CountUniqueBooks.count(str1,str2));
    }
}