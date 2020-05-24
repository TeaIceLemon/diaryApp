package pl.diary.diaryApp.model.entity;

public class Insight {
    private int id;
    private Type type;
    private String entry;
    private int grade;

    public static enum Type{
        Positive, Negative
    }
}
