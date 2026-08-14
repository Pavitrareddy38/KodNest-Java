
public class Mobile {

    public static void main(String[] args) {
        UnLock m = new UnLock();
        m.unLock("abcd");
        m.unLock(1234);
        Pattern p = new Pattern();
        m.unLock(p);
        Facelock f = new Facelock();
        m.unLock(f);
        Fingerprint f1 = new Fingerprint();
        m.unLock(f1);
    }
}
