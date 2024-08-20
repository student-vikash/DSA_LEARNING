package abc_viru;

import java.util.Scanner;

public class EmailValidator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of email ids
        int N = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < N; i++) {
            String email = scanner.nextLine().trim();  // Read each email

            // Validate and print the result
            System.out.println(isValidEmail(email));
        }

        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        // Check for spaces in the email
        if (email.contains(" ")) {
            return false;
        }

        // Split the email into local part and domain
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false; // '@' is not present or it's at the start/end
        }

        String localPart = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);

        // Validate local part
        if (!isValidLocalPart(localPart)) {
            return false;
        }

        // Validate domain part
        if (!isValidDomainPart(domain)) {
            return false;
        }

        return true;
    }

    private static boolean isValidLocalPart(String localPart) {
        if (localPart.length() < 1) {
            return false;
        }

        char[] localChars = localPart.toCharArray();
        if (!Character.isLetterOrDigit(localChars[0]) || !Character.isLetterOrDigit(localChars[localChars.length - 1])) {
            return false; // Must start and end with a letter/digit
        }

        boolean lastWasDot = false;
        for (char c : localChars) {
            if (c == '.') {
                if (lastWasDot) {
                    return false; // Consecutive dots
                }
                lastWasDot = true;
            } else {
                lastWasDot = false; // Reset if the current character is not a dot
                if (!(Character.isLetterOrDigit(c) || c == '-' || c == '_' || c == '.')) {
                    return false; // Invalid character present
                }
            }
        }
        return true;
    }

    private static boolean isValidDomainPart(String domain) {
        int lastDotIndex = domain.lastIndexOf('.');
        if (lastDotIndex == -1 || lastDotIndex == 0 || lastDotIndex == domain.length() - 1) {
            return false; // Must have at least one dot and it cannot be at the start or end
        }

        String[] domainParts = domain.split("\\.");
        if (domainParts[domainParts.length - 1].length() < 2) {
            return false; // Last part must be at least 2 characters long
        }

        for (String part : domainParts) {
            if (part.length() == 0 || !isValidDomainSegment(part)) {
                return false; // Each part should be valid
            }
        }
        return true;
    }

    private static boolean isValidDomainSegment(String segment) {
        for (char c : segment.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '-')) {
                return false; // Invalid character present
            }
        }
        return true;
    }
}
