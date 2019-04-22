import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tries {

    private static Trie root = new Tries().new Trie();

    public static void main(String[] args) {
        ArrayList<String> finds = new ArrayList<>();
        String s1 = "add hack";
        String s2 = "add hackerrank";
        String s3 = "find hac";
        String s4 = "find hak";
        System.out.println(3/2 + " " + 3%2);
        String[] arr = new String[]{s1, s2, s3, s4};
        for (String s : arr) {
            String[] opContact = s.split(" ");
            String op = opContact[0];
            String contact = opContact[1];
            if(op.equals("add"))
                addContact(contact);
            else
                finds.add(contact);
        }

        for(String contact: finds)
            findPartials(contact);
    }

    private static void findPartials(String partial) {
        int count = 0;
        Trie end = getToEnd(partial);
        if(end != null)
            count = countWords(end);
        System.out.println(count);
    }

    private static int countWords(Trie trie) {
        int count = trie.isWord ? 1 : 0;
        HashMap<String, Trie> children = trie.getAllChildren();
        for (Map.Entry<String, Trie> entry : children.entrySet()) {
            count += countWords(entry.getValue());
        }
        return count;
    }

    private static Trie getToEnd(String partial) {
        String[] arr = partial.split("");
        Trie end = root;
        //Traverse to end
        for(String c: arr) {
            if(end.hasChild(c))
                end = end.getChild(c);
            else
                return null;
        }
        return end;
    }

    private class Trie {
        private HashMap<String, Trie> children;
        private boolean isWord;

        private Trie() {
            this.children = new HashMap<>();
            this.isWord   = false;
        }

        private HashMap<String, Trie> getAllChildren() {
            return children;
        }

        private void addChild(String c) {
            if(!hasChild(c))
                children.put(c, new Trie());
        }

        private Trie getChild(String c) {
            return children.get(c);
        }

        private boolean hasChild(String c) {
            return children.containsKey(c);
        }

        private void setIsWordTrue() {
            this.isWord = true;
        }
    }

    private static void addContact(String word) {
        String[] arr = word.split("");
        Trie trie = root;
        for(int i = 0; i < arr.length; i++) {
            String c = String.valueOf(arr[i]);
            trie.addChild(c);
            trie = trie.getChild(c);
            if(i == arr.length-1)
                trie.setIsWordTrue();
        }
    }
}
