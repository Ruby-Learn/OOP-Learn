package ruby.ooplearn.noneEncapsulation;

import ruby.ooplearn.Membership;

import java.time.LocalDate;


public class NoneEncapsulationAccount {

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
}
