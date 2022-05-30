public class secondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(1,56));
        System.out.println(getDurationString(3661));

    }

    //percek és mp-ek megadásából számítja ki az ó,p,mp adatot
    public static String getDurationString(int minutes,int seconds){
        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            return "Invalid value";
        } else {

            int minutesRemained = minutes % 60;
            int hours = minutes/60;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesRemainedString = minutesRemained + "m ";
            if (minutesRemained < 10) {
                minutesRemainedString = "0" + minutesRemainedString;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesRemainedString + secondsString;

        }
    }

    //mp-ekből számolja ki a perc,mp adatot (felhasználva az előző methodot)
    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            int secondsRemained = seconds % 60;
            return getDurationString(minutes,secondsRemained); //itt a most létrehozott új változókat adtuk meg a meghívott method értékeiként
        }
    }
}
