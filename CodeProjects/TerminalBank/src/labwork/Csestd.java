class Csestd extends Student {

    Csestd(String a, int b) {
        this.name = a;
        this.roll = b;
    }
    
    @Override
    void showInfo() {
        System.out.println(name);
        System.out.println(roll);
    }
}