
public class PrinterPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
       phoneBook.addPhoneBook("Aigul", 987063058);
       phoneBook.addPhoneBook("Svetlana", 917022058);
       phoneBook.addPhoneBook("Kirill", 90636434);
       phoneBook.addPhoneBook("Andrey", 90436481);
       phoneBook.addPhoneBook("Aigul", 91784675);

       System.out.println(phoneBook.find("Svetlana"));
       System.out.println(phoneBook.getPhoneBook());




    }
 

  

}
