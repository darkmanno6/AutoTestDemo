package javastudy;

import java.io.File;
import java.io.IOException;

public class FilePath {
     private static String getParentDirectory(){
//        return "Auto_automation2.0";
        File directory = new File("");
        String courseFile = null;
        try {
            courseFile = directory.getCanonicalPath();
            System.out.println(courseFile);
            int startIndex = courseFile.indexOf("jobs")+"jobs".length();
            System.out.println(String.valueOf(startIndex));
            int endIndex = courseFile.indexOf("/", startIndex+1);
//            int endIndex = courseFile.lastIndexOf("/");
            System.out.println(String.valueOf(endIndex));
            courseFile = courseFile.substring(startIndex+1,endIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseFile.trim();
    }

    public static void main(String[] args){
        System.out.println(getParentDirectory());
    }
}
