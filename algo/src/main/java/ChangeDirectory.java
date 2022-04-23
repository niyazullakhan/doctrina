package string;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ChangeDirectory {

    public static void main(String[] args) {
        String currentDirectory = "/a/b/c";
        String changeDirectory = "/d/../e" ;

        String finaPath = changeDir(currentDirectory, changeDirectory);

        System.out.println(finaPath);
    }

    private static String changeDir(String currentDirectory, String changeDirectory) {
        if(currentDirectory.equals(""))
            return currentDirectory;

        if(changeDirectory.equals(""))
            return currentDirectory;

        if(changeDirectory.startsWith("/")) {
            if(!changeDirectory.contains(".."))
                return changeDirectory;
            else {
                List<String> splitStr = Arrays.asList(changeDirectory.split("/"));
                Stack<String> finalStack = new Stack<>();
                splitStr.forEach(x -> {
                    if(!x.equals("..")) {
                        finalStack.push(x);
                    } else
                        finalStack.pop();
                });
                return String.join("/", finalStack);

            }
        }

        // /a/b/c --> put in a stack
        // if .. --> pop , else add in the stack


        List<String> splittedCurrPath = Arrays.asList(currentDirectory.split("/"));
        Stack<String> currPath = new Stack<>();

        splittedCurrPath.forEach(x -> currPath.push(x));

        splittedCurrPath = Arrays.asList(changeDirectory.split("/"));


        splittedCurrPath.forEach(x -> {
            if(x.equals(".."))
                currPath.pop();
            else
                currPath.push(x);
        });

        return String.join("/",currPath);


    }
}
