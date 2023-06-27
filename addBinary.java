package SDESHEET;

public class addBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String binary1 = "101";
        String binary2 = "0110";

        String result = addBinary(binary1, binary2);
        System.out.println(result); // Output: 10010
    }

}
