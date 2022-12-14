public class DigitalVideoDisc {
    public String getTitle;
    private String title;
        private String category;
        private String director;
        private int length;
        private float cost;
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getCategory() {
            return category;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public String getDirector() {
            return director;
        }
        public void setDirector(String director) {
            this.director = director;
        }
        public int getLength() {
            return length;
        }
        public void setLength(int length) {
            this.length = length;
        }
        public float getCost() {
            return cost;
        }
        public void setCost(float cost) {
            this.cost = cost;
        }

        /*Constructor to DigitalVideoDisc class */

        public DigitalVideoDisc (String title) {
            super();
            this.title = title;
        }

        public DigitalVideoDisc (String category, String title) {
            this.category = category;
            this.title = title;
        }

        public DigitalVideoDisc(String director, String category, String title) {
            this.director =director;
            this.category = category;
            this.title = title;
        }

        public DigitalVideoDisc(String director, String category, String title, int length, float cost) {
            this.director = director;
            this.category = category;
            this.title = title;
            this.length = length;
            this.cost = cost;
        }


}


