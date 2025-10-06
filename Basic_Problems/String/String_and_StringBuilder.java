public class String_and_StringBuilder {
    public static void main(String[] args) {
        String a = "Varadraj";
        String b = "Varadraj";
        System.out.println(a == b);//true
        String name1 = new String("Varadaraj");
        String name2 = new String("Varadaraj");
        System.out.println(name1 == name2);//false beacause we created 2 new strings in heap
        System.out.println(name1.equals(name2));//true
    }
}
