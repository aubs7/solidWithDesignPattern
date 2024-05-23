public class TestProgram {
    public static void main(String[] args) {
        Borrowable borrowService = new LibraryBorrowService();
        Student student = new Student(borrowService);

        Resource book = new Book("My First in Java");
        Resource journal = new Journal("Journal of a Wimpy Kid");

        student.borrowResource(book);
        student.borrowResource(journal);

        Resource encyclopedia = new Resource() {
            private String title = "Ocean Encyclopedia";

            @Override
            public String getTitle() {
                return title;
            }
        };

        student.borrowResource(encyclopedia);
    }
}