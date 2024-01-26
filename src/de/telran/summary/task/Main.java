package de.telran.summary.task;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Iphone iphone12 = new Iphone("12",
                "Black",
                128,
                48,
                2,
                "17.2");
        AndroidPhone sumsungS23 = new AndroidPhone("s23",
                "white",
                256,
                76,
                3,
                "17.12812");
        Iphone iphone15 = new Iphone("15",
                "Black",
                128,
                48,
                2,
                "17.1");

//        Phone basePhone = "sdkj";

        Phone[] phones = new Phone[]{iphone15, iphone12, sumsungS23};
        Phone[] multiSimPhones;
        multiSimPhones = getPhonesWithMoreThaneTwoSim(phones);
//        System.out.println(Arrays.toString(multiSimPhones));


        Phone[] samePrefixPhones = getPhonesWhereVersionStartsWithPrefix(phones, "17");
        System.out.println(Arrays.toString(samePrefixPhones));

    }

    static Phone[] getPhonesWithMoreThaneTwoSim(Phone[] phones) {
        Phone[] filteredPhones = new Phone[phones.length];
        int count = 0;
        for (Phone phone : phones) {
            if (phone.simCount > 2) {
                filteredPhones[count++] = phone;
            }
        }
        return Arrays.copyOf(filteredPhones, count);

    }

    static Phone[] getPhonesWhereVersionStartsWithPrefix(Phone[] phones, String versionPrefix) {
        Phone[] filteredPhones = new Phone[phones.length];
        int count = 0;
        for (Phone phone : phones) {
            if (phone instanceof Iphone && ((Iphone) phone).getVersion().indexOf(versionPrefix) == 0) {
                filteredPhones[count++] = phone;
            }
            if (phone instanceof AndroidPhone && ((AndroidPhone) phone).getVersion().indexOf(versionPrefix) == 0) {
                filteredPhones[count++] = phone;
            }
        }
        return Arrays.copyOf(filteredPhones, count);

    }
}