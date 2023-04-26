public class PhraseRunner {
    public static void main(String[] args){
        Phrase phrase1 = new Phrase("aaa");
        System.out.println(phrase1.findNthOccurrence("aaa", 1));
        System.out.println(phrase1.findLastOccurrence("a"));
    }
}
