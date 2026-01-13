public class User {
    int id;
    String name, role, pre = "";
    User(String Name, String Role, int Id) {
        this.name = Name;
        this.role = Role;
        this.id = Id;
    }
    void showInfo() {
        System.out.println(pre + " " + name);
        System.out.println(role);
        System.out.println(id);
    }
}