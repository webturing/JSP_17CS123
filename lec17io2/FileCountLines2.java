package lec17io2;

import java.util.Vector;

public class FileCountLines2 {
    //支持单一文件的行统计
    //支持嵌套目录的文件 行统计
    public static void main(String[] args) {
        String parent="demo";
        int total=getLinesFromFolder(parent);
        System.out.println(total);
    }

    private static int getLinesFromFolder(String path) {
        Vector<String> allFiles=GetAllFilesFromFolder.getAllFilesFromFolder(path);
        int tot=0;
        for(String file:allFiles)
            tot+=FileCountLines.countLinesFromFile(file);
        return tot;
    }
}
