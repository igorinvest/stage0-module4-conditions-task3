package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            //english letter
            char ch = Character.toLowerCase(character);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                System.out.println("Vowel");
            } else{
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
