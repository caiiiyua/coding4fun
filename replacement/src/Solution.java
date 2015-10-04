public class Solution { 

    public String replaceSpace(StringBuffer str) {
        String orgs = str.toString();
        orgs = orgs.replaceAll("\\s", "%20");
        return orgs;
    }

    public static void main(String args[]) {
        System.out.println("Test");
        String a = "We are family";
        String b = " hello  world ";
        String c = "";
        Solution s = new Solution();
        String ar = s.replaceSpace(new StringBuffer(a));
        System.out.printf("%s changed to %s\n", a, ar);
        String br = s.replaceSpace(new StringBuffer(b));
        System.out.printf("%s changed to %s\n", b, br);
        String cr = s.replaceSpace(new StringBuffer(c));
        System.out.printf("%s changed to %s\n", c, cr);
    }
}