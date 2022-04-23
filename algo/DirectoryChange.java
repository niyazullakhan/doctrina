import java.util.Stack;

public class DirectoryChange {
    public static void main(String[] args) {
        final String src = "/a/b/c";
        final String destination = "/d/e/../fg/k/l";

        String[] srcPath = src.split("/");
        String[] destPath = destination.split("/");

        Stack<String> dirs = new Stack<>();

        if(!destination.startsWith("/")) {
            for (int i=0; i<srcPath.length; i++) {
                dirs.push(srcPath[i]);
            }

            for(int i=0; i<destPath.length; i++) {
                if("..".equals(destPath[i])) {
                    dirs.pop();
                } else {
                    dirs.push(destPath[i]);
                }
            }
        } else {
            for(int i=0; i<destPath.length; i++) {
                if("..".equals(destPath[i])) {
                    dirs.pop();
                } else {
                    dirs.push(destPath[i]);
                }
            }
        }

        System.out.println(dirs);



    }
}
