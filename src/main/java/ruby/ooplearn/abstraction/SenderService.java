package ruby.ooplearn.abstraction;

public class SenderService {
    private final Sender sender;

    public SenderService(Sender sender) {
        this.sender = sender;
    }

    public void cancel(String message) {
        // Sender 를 구현한 콘크리트 클래스를 외부에서 변경하여도 코드를 변경하지 않아도 됨
        sender.cancel(message);
    }

}
