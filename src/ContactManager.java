public class ContactMananager { //classa
        Contact [] myFriends; //array
        int friendsCount; // licznik kontktow

        ContactMananager(){ //konstruktor
        this.friendsCount = 0;
        this.myFriends = new Contact[500]; //
        }

        void addContact (Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;

        }
        Contact searchContact(String searchName){
        for(int i = 0; i < friendsCount; i++)
        if (myFriends[i].name.equals(searchName)) {
        return myFriends;
        }
        }
        return null;
        }

