public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
//            if (Character.toLowerCase(s.charAt(i)) == 'a') {
//                output += 4;
//            } else if (Character.toLowerCase(s.charAt(i)) == 'e') {
//                output += 3;
//            } else if (Character.toLowerCase(s.charAt(i)) == 'i') {
//                output += 1;
//            } else if (Character.toLowerCase(s.charAt(i)) == 'o') {
//                output += 0;
//            } else if (Character.toLowerCase(s.charAt(i)) == 'u') {
//                output += 9;
//            } else {
//                output += s.charAt(i);
//            }

            // Switch case instead of above if-else statements. Cleaner code:

            switch (Character.toLowerCase(s.charAt(i))) {
                case 'a':
                    output += 4;
                    break;
                case 'e':
                    output += 3;
                    break;
                case 'i':
                    output += 1;
                    break;
                case 'o':
                    output += 0;
                    break;
                case 'u':
                    output += 9;
                    break;
                default:
                    output += s.charAt(i);
            }
        }
        return output;
    }
}
