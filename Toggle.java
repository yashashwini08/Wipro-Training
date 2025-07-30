// 42.	Program to accept a character, if the entered character is in upper case then convert it into lower case and vice versa.( Toggle)   a      A        A    a
// program to toggle the string case of a character.
class Toggle {
    public static void main(String[] args) {
        // char ch = 'a'; // Example character

        // // Toggle case
        // if (Character.isUpperCase(ch)) {
        //     ch = Character.toLowerCase(ch);
        // } else if (Character.isLowerCase(ch)) {
        //     ch = Character.toUpperCase(ch);
        // }

        // System.out.println("Toggled character: " + ch);

        String str = "Somya Lakshmi"; // Example string
        StringBuilder toggledStr = new StringBuilder(); 
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch); // Non-alphabetic characters remain unchanged
            }
            
        }
        System.out.println("Toggled character: " + str + " to " + toggledStr.toString() 
                           + " (case toggled)"  );
    }
}