public class LibraryBorrowService implements Borrowable {
    @Override
    public void borrow(Resource resource) {
        System.out.println("You are now borrowing: " + resource.getTitle());

    }
}