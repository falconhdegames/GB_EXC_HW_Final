package CW;

public class Checker {
    public boolean isNumeric(String value) {
        if (value == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(value);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isDate(String value) {
        String[] split = value.split(".");
        if (split.length != 3) return false;
        else {
            if (isNumeric(split[0]) & isNumeric(split[1]) & isNumeric(split[2])) {
                return true;
            }
            else return false;
        }
    }

    public boolean isPhoneNumber(String value) {
        if (value.length() != 12) {
            return false;
        }
        else {
            String temp = value.substring(1, 11);
            if (!isNumeric(temp)) return false;
            else return true;
        }
    }

    public boolean isGender(String value) {
        if (value == "м" || value == "мужской") return true;
        else if (value == "ж" || value == "женский") return true;
        else return false;
    }

    public boolean check(String[] data) {
        // returns true if everything is correct
        // returns false if mistakes found, prints message

        if (data.length != 6) {
            System.out.println("Вы ввели неверное количество данных!");
            return false;
        }
        else if (!isDate(data[3])) {
            System.out.println("Вы неправильно ввели дату рождения!");
            return false;
        }
        else if (!isPhoneNumber(data[4])) {
            System.out.println("Введите телефон в формате +7xxxxxxxxxx");
            return false;
        }
        else if (!isGender(data[5])) {
            System.out.println("Введите пол в формате м/ж (мужской/женский)!");
            return false;
        }
        else return true;
    }
}
