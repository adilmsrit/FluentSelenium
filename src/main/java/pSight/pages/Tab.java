package pSight.pages;

public enum Tab {
    ALL("All"), COURSES("Courses"), BLOG("Blog"), RESOURCES("Resources"), AUTHOR("Author");

    private String value;

    Tab(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
