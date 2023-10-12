package org.example.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        // 싱글톤 사용 안하면 두개 다름
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings == settings1);

        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(settings == settings1);

        //리플렉션 사용시 깨짐
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings2 = constructor.newInstance();
        System.out.println(settings == settings2);

        //직렬화 역직렬화시 깨질 수 있다.
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings1 = (Settings) in.readObject();
        }
        System.out.println(settings == settings1);

        //enum 사용시 리플렉션, 직렬화에 안전
        EnumSettings enumSettings = EnumSettings.INSTANCE;
        Constructor<EnumSettings> enumSettingsConstructor = EnumSettings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSettings enumSettings2 = enumSettingsConstructor.newInstance();
        System.out.println(enumSettings == enumSettings2);

    }
}
