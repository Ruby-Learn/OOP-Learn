package ruby.ooplearn.noneAbstraction;

public class NoneAbstractionSenderService {

//    private NoneAbstractionSnsSender snsSender;
    private final NoneAbstractionEmailSender noneAbstractionEmailSender;

//    public NoneAbstractionSenderService(NoneAbstractionSnsSender noneAbstractionSnsSender) {
    public NoneAbstractionSenderService(NoneAbstractionEmailSender noneAbstractionEmailSender) {
        this.noneAbstractionEmailSender = noneAbstractionEmailSender;
    }

    public void cancel(String message) {

        // 추상화한 인터페이스 또는 추상 클래스가 아닌 콘크리트 클래스를 직접 사용하면 변경 때마다 사용한 모든 코드를 찾아서 수정해야 함!
//        NoneAbstractionSnsSender.cancel(message);
        noneAbstractionEmailSender.cancel(message);
    }

}
