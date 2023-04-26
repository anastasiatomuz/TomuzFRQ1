public class Phrase {
    private String currentPhrase;

    public Phrase(String p){
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n){
        int lenStr = str.length();
        int count = 0;
        for (int i = 0; i <= currentPhrase.length() - lenStr; i ++){
            String temp = currentPhrase.substring(i, i + lenStr);
            if (temp.equals(str)){
                count ++;
                if (count == n){
                    return i;
                }
            }
        }
        return -1;
    }


    public int findLastOccurrence(String str){
        /*my solution but you can change it with another solution*/
        if (findNthOccurrence(str, 1) == -1){
            return -1;
        }

        String original = currentPhrase;
        int count = 0;
        int indFound = findNthOccurrence(str,1);
        while (findNthOccurrence(str, 1) != -1){
            currentPhrase = currentPhrase.substring(indFound + str.length());
            count ++;
            System.out.println(currentPhrase);
        }
        currentPhrase = original;
        System.out.println(currentPhrase + " " + count);
        return findNthOccurrence(str, count);
    }
}