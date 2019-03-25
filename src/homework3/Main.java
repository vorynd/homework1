package homework3;

public class Main {
    public static void main(String[] args) {
        Addressee addressee1 = new Addressee();
        Addressee addressee2 = new Addressee("John", "Smith", "Student","+380634554545");

        System.out.println(addressee1.toString());
        System.out.println(addressee2.toString());
        System.out.println();

        System.out.println(addressee2.getName());
        System.out.println(addressee2.getSurname());
        System.out.println(addressee2.getSocialStatus());
        System.out.println(addressee2.getPhoneNumber());
        System.out.println();

        addressee1.setName("Jack");
        addressee1.setSurname("Jackson");
        addressee1.setSocialStatus("Teacher");
        addressee1.setPhoneNumber("+380932252525");
        System.out.println(addressee1.toString());

    }

}
