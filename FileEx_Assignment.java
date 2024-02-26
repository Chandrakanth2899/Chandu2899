package learning.Day25;

import java.io.*;
import java.util.Scanner;

public class FileEx_Assignment {
    public static void main(String[] args) throws IOException {
    	
    	
    	InputStream ins=System.in;
    	int c=ins.read();
    	OutputStream out=new FileOutputStream("Chandhu.txt");
    	while((char)c!='^') {
    		out.write(c);
    		out.flush();
    		c=ins.read();
    	}

        Reader reader=new FileReader("Chandhu.txt");
        BufferedReader br=new BufferedReader(reader);

        int counter=0;
        int counter1=0;
        Scanner sc = new Scanner(System.in);
        
        String searching_word=sc.nextLine();
        String Searching_word1=sc.nextLine();

        String s=br.readLine();
        while(s!=null) {
            if(s.length()!=0){
                String[] str=s.trim().split("\\s+");
                counter=counter+str.length;
                for(String i:str){
                    if(Searching_word1.equalsIgnoreCase(i)){
                        counter1++;
                    }
                }
            }

            s= br.readLine();
        }
        System.out.println("total number of words : "+counter);
        System.out.println("the number of times the given word was repeated was "+counter1);

       
        File path=new File("/Users/chandu/eclipse-workspace/ThreadsDemo/src/lesson3chandu ");
        File[] files=path.listFiles();
        if(files!=null){
            int no_of_files= files.length;
            System.out.println("number of files in the given path "+no_of_files);
            for (File file:files){
                System.out.println(file.getName());
            }

        }

    }
}