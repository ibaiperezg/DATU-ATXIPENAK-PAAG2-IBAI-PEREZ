package paagbi;




import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatzu {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutputordez.txt");

            int c;
            while ((c = inputStream.read()) != -1) 
            {
                if(c=='a'){
                    c='o';
                }else if(c=='A'){
                    c='O';

                }
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
