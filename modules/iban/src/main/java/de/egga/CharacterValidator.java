package de.egga;

public class CharacterValidator {


    public static boolean isLetter(Character character) {
        if (Character.getType(character) == Character.LOWERCASE_LETTER) {
            return true;
        }
        return false;
    }
}
