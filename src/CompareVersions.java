import java.util.Scanner;

public class CompareVersions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current version: ");
        String str1 = sc.nextLine();
        System.out.println("Enter actual version: ");
        String str2 = sc.nextLine();
        System.out.println(versionCompare(str1, str2));
    }

    public static String versionCompare(String str1, String str2) {
        String result;
        String[] vals1 = str1.split("\\.");
        String[] vals2 = str2.split("\\.");
        int i = 0;

        while (i < vals1.length && i < vals2.length && vals1[i].equals(vals2[i])) {
            i++;
        }

        if (i < vals1.length && i < vals2.length) {
            if (Integer.parseInt(vals1[i]) > (Integer.parseInt(vals2[i]))) {
                result = "Current version = " + str2 + ", Actual version = " + str1;
            } else {
                result = "Current version = " + str1 + ", Actual version = " + str2;
            }
        } else {
            result = "Versions match";
        }
        return result;
    }
}

