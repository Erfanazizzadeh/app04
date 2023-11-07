// in this tutorial proejct we want use The FileWriter and ..Reader and Delete File
// Write a program that uppercases the text file


import java.io.File;
import java.io.FileWriter;


public class Test {

    public static void main(String[] args) throws Exception{// ioException
        show();
        deletedFile();
    }
        public  static void  show() throws  Exception{// ioException
            FileWriter fileWriter = new FileWriter("D:\\app04.txt");
            String str = "hello erfan this is your test.\n";
            fileWriter.write(str);
            // here we want to uppercase all text
            fileWriter.write("UpperCase the String :\n");
            fileWriter.write(str.toUpperCase());
            fileWriter.close();// this is necessary for finish or close the FileWriter
            System.out.println("that's worked. ");
        }
        public  static void  deletedFile() throws InterruptedException {// in this method we want use File Class to delete file
            System.out.println("we want to delete the app after 5s");
            Thread.sleep(10000);
            File file = new File("D:\\app04.txt");
            file.delete();
            Thread.sleep(3000);
            System.out.println("Finish Deleting :)");
        }
        // use the debug for how it's worked theis methods :)
}
