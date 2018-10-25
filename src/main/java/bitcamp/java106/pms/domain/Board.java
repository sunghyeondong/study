package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Board {
    public int no;
    public String title;
    public String content;
    public Date createdDate;
}

//ver 13 - 등록일의 데이터 타입을 String에서 Date으로 변경