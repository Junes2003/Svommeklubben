public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.initializeMenu();

        FileReader reader = new FileReader("files/MemberInfo.csv");
        List<Member> members = reader.readFile();
        System.out.println(members);
    }
}

