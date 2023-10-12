package org.example.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings() {
    }

    // 멀티스레드 환경에서 안전하게 하는방법 1 - 인스턴스 뽑을 때마다 동기화 하기 때문에 성능이슈 생길 수 있음
//    private static Settings instance;
//    public static synchronized Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

    // 멀티스레드 환경에서 안전하게 하는방법 2 - 이른 초기화(미리 만든다는 것이 단점이 될 수 있다.)
//    private static final Settings INSTANCE = new Settings();
//    public static Settings getInstance() {
//        return INSTANCE;
//    }

    // 멀티스레드 환경에서 안전하게 하는방법 3 - double checked locking
//    private static volatile Settings instance;
//    public static Settings getInstance() {
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    instance = new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    // 멀티스레드 환경에서 안전하게 하는방법 4 - static inner 클래스 사용
    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }
    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    //역직렬화 막는 방법
    protected Object readResolve() {
        return getInstance();
    }
}
