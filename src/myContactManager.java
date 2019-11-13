public class void main(String [] args) {

        ContactManager myContactManager = new ContactMananager(); //tworzenie nowego managera
        Contact cIzabela = new Contact(); //tworzenie nowego kontaktu, dodawanie nr tel i iminenia,
        cIzabela.name = "Izabela"";
        cIzabela.phoneNumber = "0049123456789";
        myContactManager.addContact(cIzabela); //dodawanie kontaktu do managera

        Contact cMichal = new Contact();
        cMichal.name = "Michał";
        cMichal.phonenumber = "0068789543567";
        myContactManager.addContact(cMichal);

        Contact result = myContactManager.searchContact("cMichal") // wyszukiwanie kontatku i wyswietlanie nr telefnu

        System.out.println(result.phonenumber);


        }
