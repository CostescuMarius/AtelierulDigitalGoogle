package exceptions.challenge1;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        /*FileInputStream input = null;
        try {
            input = new FileInputStream("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt");

            FileOutputStream output = new FileOutputStream("./src/out.txt");
            int i = input.read();
            while (i  != -1) {

                i = input.read();

                System.out.println(input.read());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/



        Contact[] contacte = new Contact[100];
        int contor = 0;

        Scanner s = null;
        double sum = 0;

        try {
            URL input = new URL("https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt");
            URLConnection yc = input.openConnection();
            s = new Scanner(new BufferedReader(new InputStreamReader(yc.getInputStream())));

            //s.useLocale(Locale.US);

            while(s.hasNext()) {
                //Stri
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(s != null)
                s.close();
        }
    }

}
