package domashKa;

public class MainApp {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        bst.insert(4);
        System.out.println("Поиск 3: " + bst.find(3));
        System.out.println("Поиск 7: " + bst.find(7));
        System.out.println("Отсортированный список: " + bst.getSortedList());
    }
}
