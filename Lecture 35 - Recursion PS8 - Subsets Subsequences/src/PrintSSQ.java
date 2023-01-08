public class PrintSSQ {
    static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSSQ(remString, currAns + curr); // add curr
        printSSQ(remString, currAns);  // do not add curr
    }

    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
