package lec17io2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//rm -rf
public class FolderDemo {
    public static void main(String[] args) throws IOException {
        File parent=new File("demo1");
        if(!parent.exists()){
            System.out.println(parent+" is not  existed! we will create it NOW");
            parent.mkdir();
        }else{
            System.out.println(parent+" is already existed!");
        }
        for(int i=71;i<=73;i++){
            String subFolderName="CS"+i;
            File subFolder=new File(parent,subFolderName);
            subFolder.mkdir();
            for(int j=1;j<=9;j++){
                File subsubFile=new File(subFolder,"2701170"+(i-70)+"0"+j+".txt");

                subsubFile.createNewFile();
                System.out.println(subsubFile.getAbsolutePath());
                FileOutputStream fos=new FileOutputStream(subsubFile);
               for(int k=0;k<100;k++){
                   fos.write('a'+(int)(Math.random()*26));
               }
                fos.close();

            }
        }
    }
}
