package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args)throws IOException {

        FileOutputStream f1=null;
        FileChannel f=null;
        try{
            f1=new FileOutputStream("/Users/user/Desktop/NewDirectory/Rakib.txt");
            f1.write('r');
            f=f1.getChannel();
            long pos=f.position();
           System.out.println(pos);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if(f1!=null){
                f1.close();
            }
            if(f!=null){
                f.close();
            }
        }
    }
}
