import java.util.Stack;

class SimplifyPath {
    static String simplifyPath(String A) {
        if(A.isEmpty() || A.equals("/"))
            return "/";
        String[] paths = A.split("/");
        Stack<String> stack = new Stack<>();
        for(String path: paths) {
            if(path.equals(".") || path.isEmpty())
                continue;
            else if (path.equals("..")) {
                if(!stack.isEmpty())
                    stack.pop();
                continue;
            }
            stack.push(path);
        }

        if(stack.isEmpty())
            return "/";

        Stack<String> reverse = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        while(!stack.isEmpty())
            reverse.push(stack.pop());
        while(!reverse.isEmpty())
            stringBuilder.append("/").append(reverse.pop());
        return stringBuilder.toString();
    }
}

