public class Student {

    private Borrowable borrowableService;

    public Student(Borrowable borrowableService) {
        this.borrowableService = borrowableService;
    }

    public void borrowResource(Resource resource) {
        borrowableService.borrow(resource);
    }

}
