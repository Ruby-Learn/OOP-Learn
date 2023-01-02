package ruby.ooplearn.encapsulation;

import ruby.ooplearn.Membership;

import java.time.LocalDate;


public class Account {

    private Membership membership;
    private LocalDate expDate;
    private LocalDate serviceDate;

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public Membership getMembership() {
        return membership;
    }

    public LocalDate getExpDate() {
        return expDate;
    }


//    public boolean hasRegularPermission() {
//        return membership.equals(Membership.REGULAR) && expDate.isAfter(LocalDate.now());
//    }

    // 기능 추가로 인한 코드 변경시 사용하는 곳은 변경할 필요 없이 해당 부분만 변경하면 된다.
    public boolean hasRegularPermission() {
        LocalDate now = LocalDate.now();
        return membership.equals(Membership.REGULAR) &&
                (
                        (serviceDate.isAfter(now.plusYears(5)) && expDate.isAfter(now)) ||
                                serviceDate.isBefore(now.plusYears(5))
                );
    }
}
