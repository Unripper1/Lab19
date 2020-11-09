import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Formatter f = null;
        {
            try {
                f = new Formatter("test.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        f.format(str);
        f.close();
        File file=new File("test.txt");
        Scanner scf=null;
        try {
            scf=new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scf.hasNext()){
            System.out.print(scf.nextLine());
        }
        scf.close();


        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(" update");

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
