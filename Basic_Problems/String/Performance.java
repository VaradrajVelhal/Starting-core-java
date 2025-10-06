public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i <= 26; i++) {
            char ch =  (char) ((char)'a' + i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);//abcdefghijklmnopqrstuvwxyz
        //here we are not modifying the existing String, we are creating new string everytime
        //Beacause of new creation everytime the performance is degrading
    }
}
