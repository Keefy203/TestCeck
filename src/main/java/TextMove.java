import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TextMove
{
    public ArrayList<String> readFromFile(String file) throws IOException
    {
        ArrayList<String> text= new ArrayList<String>();
        FileReader filer=new FileReader(file);
        Scanner scan = new Scanner(filer);
        while (scan.hasNextLine())
        {
            text.add(scan.nextLine());
        }
        filer.close();
        return text;
    }

    public ArrayList<String> sort(ArrayList<String>text) {
        Comparator comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.length() == t1.length()) {
                    return 0;
                } else if (s.length() > t1.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };
        ArrayList<String> SortedText = text;
        Collections.sort(SortedText, comparator);
        return SortedText;
    }
        public void writeToFile(ArrayList<String> text, String file) throws  IOException
        {
            FileWriter fileWriter=new FileWriter(file);
            for (String line: text)
            {
                fileWriter.write(line+"\n");
}
            fileWriter.close();
        }


}

