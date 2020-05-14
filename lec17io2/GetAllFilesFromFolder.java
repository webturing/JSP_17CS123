package lec17io2;

import java.io.File;
import java.util.Collections;
import java.util.Vector;

public class GetAllFilesFromFolder {
    public static void main(String[] args) {
        String parent= "demo1";
        Vector<String> files=getAllFilesFromFolder(parent);
        for(String file:files){
            System.out.println(file);
        }
    }

    public static Vector<String> getAllFilesFromFolder(String parent) {
        Vector<String> result=new Vector<>();
        File file=new File(parent);
        if(file.isDirectory()) {
            for (String ff : file.list()) {
                File sf=new File(file,ff);
                if(sf.isDirectory()){
                    result.addAll(getAllFilesFromFolder(sf.getAbsolutePath()));//core
                }else{
                    result.add(sf.getAbsolutePath());
                }
            }
        }else{
            result.add(file.getAbsolutePath());
        }
        Collections.sort(result);
        return result;
    }
}
