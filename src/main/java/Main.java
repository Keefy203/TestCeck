import java.io.IOException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        TextMove workwithText = new TextMove();
        ArrayList<String> text = workwithText.readFromFile("TestForJava1.txt");
        text = workwithText.sort(text);
        workwithText.writeToFile( text,"TestForJava2.txt");;
    }
}
