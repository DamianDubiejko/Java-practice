class Zeros_remover {

    // Method to remove leading zeros in a string
    public static String removeZero(String str) {
        // Count leading zeros
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }

        // If the string is made of only zeros, return "0"
        if (i == str.length()) {
            return "0";
        }

        // Return the substring from the first non-zero character
        return str.substring(i);
    }

    // Main driver method
    public static void main(String[] args) {

        // Sample string input
        String str = "00000123569";

        // Remove leading zeros
        str = removeZero(str);

        // Printing the string after removing leading zeros
        System.out.println(str);
    }
}
