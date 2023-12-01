package ie.ul.libraryfinder;

    public class libraryModel {

        private String book_name;
        private int book_rating;
        private int book_image;

        //Book object for adding review
        public libraryModel(String book_name, int book_rating, int book_image) {
            this.book_name = book_name;
            this.book_rating = book_rating;
            this.book_image = book_image;
        }

        // Getter and Setter for book rating
        public String getbook_name() {
            return book_name;
        }

        public void setbook_name(String book_name) {
            this.book_name = book_name;
        }

        public int getbook_rating() {
            return book_rating;
        }

        public void setbook_rating(int book_rating) {
            this.book_rating = book_rating;
        }

        public int getbook_image() {
            return book_image;
        }

        public void setbook_image(int book_image) {
            this.book_image = book_image;
        }
    }
