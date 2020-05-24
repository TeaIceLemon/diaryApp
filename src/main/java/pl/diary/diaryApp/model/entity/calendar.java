package pl.diary.diaryApp.model.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data

public class calendar {
    private int id;
    private Date day;
    private List<Insight> insightList;


}
