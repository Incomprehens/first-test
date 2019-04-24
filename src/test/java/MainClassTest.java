import org.junit.jupiter.api.Test;

public class MainClassTest extends MainClass
{


    @Test
    public void testGetLocalNumber()
    {
        typeStartTest();

        if (getLocalNumber()==14)
        {
            System.out.println("метод getLocalNumber возвращает число 14 - метод getLocalNumber="+getLocalNumber());

        }else  System.out.println("метод getLocalNumber не возвращает число 14 - метод getLocalNumber="+getLocalNumber());


        typeFinishTest();

    }




    @Test
    public void testGetClassNumber()
    {

        typeStartTest();

        if (getClassNumber()>45)
        {
            System.out.println("метод getClassNumber возвращает число больше 45 - мутод getClassNumber="+getClassNumber());
        }

        else  System.out.println("метод getLocalNumber не возвращает число 45 - мутод getClassNumber="+getClassNumber());
        typeFinishTest();
    }
}
