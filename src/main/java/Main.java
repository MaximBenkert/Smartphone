import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Contact myNewBusinessContact = new BusinessContact ("Mr. Smith", "company x");
        Contact myOtherNewFriend = new Friend ("Tom", 01644545455);

        ArrayList<Contact> myContacts = new ArrayList<Contact>();

        myContacts.add(myNewBusinessContact);
        myContacts.add(myOtherNewFriend);

        Smartphone mySmartphone = new Smartphone ("iPhone", "Apple", myContacts);
        System.out.println(mySmartphone);


    }
}
