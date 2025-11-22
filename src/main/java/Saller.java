public class Saller {
    private String fullName;
    private int number;
    public Saller(String fullName, int number) {
        this.fullName = fullName;
        this.number = number;
    }
    public void showInformation() {
        System.out.println("Your name - " + fullName);
    }

}
