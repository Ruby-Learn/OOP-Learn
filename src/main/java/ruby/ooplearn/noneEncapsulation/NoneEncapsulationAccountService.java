package ruby.ooplearn.noneEncapsulation;

import ruby.ooplearn.Membership;

import java.time.LocalDate;

public class NoneEncapsulationAccountService {

    public void service(NoneEncapsulationAccount account) {
        LocalDate now = LocalDate.now();

        // 변경 전
        if (account.getMembership().equals(Membership.REGULAR) && account.getExpDate().isAfter(now)) {
            // ... 정회원 기능
        }

        // 기능 추가로 인한 코드 변경. 해당 코드가 여러 곳에 있을 경우 모두 찾아서 수정해야 함
        if (account.getMembership().equals(Membership.REGULAR) &&
                (
                        (account.getServiceDate().isAfter(now.plusYears(5)) && account.getExpDate().isAfter(now)) ||
                        account.getServiceDate().isBefore(now.plusYears(5))
                )
        ) {
            // ... 정회원 기능
        }
    }
}
