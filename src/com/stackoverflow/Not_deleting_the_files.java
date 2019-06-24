package com.stackoverflow;//https://stackoverflow.com/questions/56612861/not-deleting-the-files


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Not_deleting_the_files {

    public static void main(String[] args) throws Exception {
        File directory = new File("/Users/ashishraghavan/Production/StackOverFlowTestData/");
        if(!directory.isDirectory()) {
            System.out.println("Given file is not a directory");
            return;
        }
        String line;
        int count = 0;
        File[] fileList = directory.listFiles(File::isFile);
        if(fileList != null && fileList.length > 0) {
            for (File file : fileList) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (line.length() > 5) {
                        count++;
                        boolean wasFileDeleted = file.delete();
                        if(wasFileDeleted) {
                            System.out.println("The file "+file.getName()+" was deleted");
                        } else {
                            System.out.println("The file "+file.getName()+" deletion did not succeed");
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("A total of "+count+" files were deleted");
    }
}
