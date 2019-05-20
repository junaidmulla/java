class ContactManager {
    Contact[] myfriend;
    int friendcount;

    public ContactManager() {
        myfriend = new Contact[100];
        friendcount = 0;
    }

    public void addContact(Contact contact) {
        myfriend[friendcount] = contact;
        friendcount++;
        System.out.println("Friendcount:" + friendcount);

    }

    public Contact searchContact(String searchName) {
        for(int i=0;i<friendcount;i++)
        {
            if(myfriend[i].name.equals.(searchName))
            {
                System.out.println("Match Found");
                return myfriend[i];
            }
        }
        System.out.println("Match not Found");
        return null;
    }
}