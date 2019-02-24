import  java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        String pathOfFiles = null;
        Scanner sc = new Scanner(System.in);
        GUI.guiLaunch();
        System.out.println("Podaj sciezke: ");
        pathOfFiles = sc.nextLine();
        try {
            File folder = new File(pathOfFiles);
            File[] listOfFiles = folder.listFiles();

            for (File fileFromList: listOfFiles) {
                if (fileFromList.isFile()) {
                    System.out.println("Plik " + fileFromList.getName());
                } else if (fileFromList.isDirectory()) {
                    System.out.println("Folder " + fileFromList.getName());
                }
            }
        }
         catch (NullPointerException e)
        {
            System.out.println("błąd - spacje / specjalne znaki w nazwie ścieżki");
            e.printStackTrace();
        }
    }
}
