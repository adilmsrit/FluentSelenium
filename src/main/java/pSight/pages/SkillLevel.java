package pSight.pages;

public enum SkillLevel {
    BEGINNER("Beginner"), INTERMEDIATE("Intermediate"), ADVANCE("Advance");

    private String value;

    SkillLevel(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
