package Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class read_file {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File f = new File("data.txt");

        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    }

}
