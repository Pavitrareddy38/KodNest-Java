
public class UnLock {

    String password;
    int pin;
    Pattern p;
    Facelock f;
    Fingerprint f1;

    void unLock(String password) {

        System.out.println("phone is unlocked by password");

    }

    void unLock(int pin) {

        System.out.println("phone is unlocked by pin");
    }

    void unLock(Pattern p) {

        System.out.println("phone is unlocked by pattern");

    }

    void unLock(Facelock f) {

        System.out.println("phone is unlocked by facelock");
    }

    void unLock(Fingerprint f1) {
        System.out.println("phone is unlocked by fingerprint");

    }
}
