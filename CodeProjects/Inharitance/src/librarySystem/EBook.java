package librarySystem;

 class EBook extends Book {

    int fileSizeMB;
    // @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Mb: " + fileSizeMB);
    }
    
}