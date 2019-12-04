package mate.academy.lessons.collection;

/**
 * Необходимо спроектировать класс Friend с полями:
 * String myName
 * Friend myFriend
 * И методом:
 * letsBeFriends с одним параметром - передаваемым другом, который присваивает полю
 * myFriend ссылку на переданного друга.
 */
public class Friend {
    String myName;
    Friend myFriend;

    void  letsBeFriends(Friend friend) {
        myFriend = friend;
    }
}
