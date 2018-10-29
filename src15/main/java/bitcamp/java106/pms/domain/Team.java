package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Team {
    public String name;
    public String description;
    public int maxQty;
    public Date startDate;
    public Date endDate;
    public Member[] members = new Member[10];
    
    // 사용자 정의 데이터 타입에서 메서드 정의란?
    // => 새 데이터 타입의 값을 다룰 연산자를 정의하는 것을 의미한다.
    
    // 연산자는 외부에서 사용하는 것이기 때문에 공개해야 한다.
    // => 그래서 public modifier를 사용한다.
    public int addMember(Member member) {
        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i] == null) {
                this.members[i] = member;
                return 1;
            }
        }
        return 0;
    }
    
    public int deleteMember(String memberId) {
        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i] == null) continue;
            if (this.members[i].id.equals(memberId)) {
                this.members[i] = null;
                return 1;
            }
        }
        return 0;
    }
    
    public boolean isExist(String memberId) {
        for (int i = 0; i < this.members.length; i++) {
            if (this.members[i] == null) continue;
            if (this.members[i].id.equals(memberId)) {
                return true;
            }
        }
        return false;
    }
}

// ver 13 - 시작일, 종료일의 데이터 타입을 String에서 Date으로 변경

