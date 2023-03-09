import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Smartphone implements GPS, Radio{
    private String nameOfModel;
    private String nameOfManufacturer;
    private List<Contact>  myContacts;

    public void addContact (Contact contact){
        myContacts.add(contact);

    }
    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public Smartphone() {
    }

    public Smartphone(String nameOfModel, String nameOfManufacturer, List<Contact> myContacts) {
        this.nameOfModel = nameOfModel;
        this.nameOfManufacturer = nameOfManufacturer;
        this.myContacts = myContacts;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public void setMyContacts(List<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(nameOfModel, that.nameOfModel) && Objects.equals(nameOfManufacturer, that.nameOfManufacturer) && Objects.equals(myContacts, that.myContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfModel, nameOfManufacturer, myContacts);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", myContacts=" + myContacts +
                '}';
    }
}
