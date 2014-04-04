package Generic;

import java.io.*;
import tries.*;

/**
 *
 * @author kunaltyagi
 */
public class Parse {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Tries trie = new Tries();
        
        FileInputStream fstream = new FileInputStream
                ("/home/kunaltyagi/workspace/studies/study-codes/CS213/assignment_2/tries/src/penn.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String line, word, type;
        word = " "; type = " ";
        while ((line = br.readLine()) != null) {
            // process the line.
            for(int i = 0; i < line.length(); ++i) {
                if(line.charAt(i) == '/')
                {
                    System.out.print(i);
                    System.out.println(line.charAt(i));
                    if(i+1 < line.length()) {
                        type = line.substring(i+1);
                    }
                    else
                    {
                       type = "NA";
                    }                   
                    if(i > 0) {
                       word = line.substring(0, i-1);
                    }
                    else {
                       word = " ";
                    }
                   
                    break;
                }
                if(i+1 == line.length()) {
                    word = " ";
                    type = "NA";
                }
            }            
            // generate the word
            if(word.length() == 0)
            {
                word = " ";
                type = "NA";
            }
            //trie.add(word);
        }
        br.close();
        
        //trie.print();
    }
    
}
