package mate.academy.lessons.sort.task25;

import java.util.*;

public class Main {

    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Integer> numberOfSchools = new ArrayList<>();
    private static ArrayList<Integer> mathematics = new ArrayList<>();
    private static ArrayList<Integer> russian = new ArrayList<>();
    private static ArrayList<Integer> informatics = new ArrayList<>();
    private static ArrayList<Double> doubleMiddle = new ArrayList<>();
    private static ArrayList<School> listSchools = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int n = Integer.parseInt(s1);

        ArrayList<School> schoolsM = new ArrayList<>();
        ArrayList<School> schoolsR = new ArrayList<>();
        ArrayList<School> schoolsI = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] ss = s.split(" ");
            String name1 = ss[0];
            String serName = ss[1];
            String numSchoolS = ss[2];
            String mathS = ss[3];
            String rusS = ss[4];
            String infS = ss[5];
            String name = name1 + " " + serName;
            names.add(name);

            Integer numSchool = Integer.parseInt(numSchoolS);
            numberOfSchools.add(numSchool);

            Integer math = Integer.parseInt(mathS);
            mathematics.add(math);
            if (math >= 10) schoolsM.add(new School(name, math));

            Integer rus = Integer.parseInt(rusS);
            russian.add(rus);
            if (rus >= 10) schoolsR.add(new School(name, rus));

            Integer inf = Integer.parseInt(infS);
            informatics.add(inf);
            if (inf >= 10) schoolsI.add(new School(name, inf));

            School school = new School(numSchool, math, rus, inf);
            add(listSchools, school, numSchool, math, rus, inf);
        }

        //Это средние балы по математике, русскому и информатике:
        Double rezMiddleMath = middleMark(n, mathematics);
        doubleMiddle.add(rezMiddleMath);
        Double rezMiddllRus = middleMark(n, russian);
        doubleMiddle.add(rezMiddllRus);
        Double rezMiddllInf = middleMark(n, informatics);
        doubleMiddle.add(rezMiddllInf);

        //Это общий средний бал по трем предметам:
        Double rexMarks = middleMarkD(3, doubleMiddle);
        String string = "Отчет по городу: математика -";
        String string2 = ", русский язык -";
        String string3 = ", инфрматика -";
        String string4 = ", общий средний балл -";
        System.out.printf(Locale.US, "%s %.1f%s %.1f%s %.1f%s %.1f", string, rezMiddleMath, string2, rezMiddllRus, string3, rezMiddllInf, string4, rexMarks);
        System.out.println("\nОтчет по школам:");

        for (School s : listSchools) {
            double sr = (s.getMath() + s.getRus() + s.getInf()) / s.getCount();
            s.setObshiyMiddleBal(sr / 3);
        }

        Collections.sort(listSchools, (o1, o2) -> (int) (o1.obshiyMiddleBal - o2.obshiyMiddleBal));
        Collections.reverse(listSchools);

        Collections.sort(schoolsI, (o1, o2) -> {
            if (o1.getName().length() - o2.getName().length() > 0) return -1;
            if (o1.getName().length() - o2.getName().length() < 0) return 1;
            return 0;
        });

        Collections.sort(schoolsR, (o1, o2) -> {
            if (o1.getName().length() - o2.getName().length() > 0) return -1;
            if (o1.getName().length() - o2.getName().length() < 0) return 1;
            return 0;
        });

        Collections.sort(schoolsM, (o1, o2) -> {
            if (o1.getName().length() - o2.getName().length() > 0) return -1;
            if (o1.getName().length() - o2.getName().length() < 0) return 1;
            return 0;
        });

        for (School s : listSchools) {
            System.out.println(s);
        }

        School schools = schoolsM.stream().max(Comparator.comparingInt(School::getMark)).get();
        School schools2 = schoolsR.stream().max(Comparator.comparingInt(School::getMark)).get();
        School schools3 = schoolsI.stream().max(Comparator.comparingInt(School::getMark)).get();

        for (School s : schoolsM) {
            if (s.getMark() == schools.getMark())
                System.out.println("Лучший результат по математике - " + s.getName() + " - " + s.getMark());
        }
        for (School s : schoolsR) {
            if (s.getMark() == schools2.getMark())
                System.out.println("Лучший результат по русскому языку - " + s.getName() + " - " + s.getMark());
        }
        for (School s : schoolsI) {
            if (s.getMark() == schools3.getMark())
                System.out.println("Лучший результат по информатике - " + s.getName() + " - " + s.getMark());
        }

    }

    public static void add(ArrayList<School> listSchools, School school, Integer numSchool, Integer math, Integer rus, Integer inf) {
        boolean r = false;
        if (listSchools.size() == 0) {
            listSchools.add(school);
        } else {
            Iterator<School> it = listSchools.iterator();
            while (it.hasNext()) {
                School school1 = it.next();
                if (school1.getNumberOfSchool() == numSchool) {
                    r = true;
                    school1.setCount(1);                 //такая школа есть по номеру
                    school1.setMath(math);
                    school1.setRus(rus);
                    school1.setInf(inf);
                    break;
                }
            }

            if (r) {
            } else {
                listSchools.add(school);        //добавляем школу
            }
        }
    }

    public static double middleMark(int kolvo, ArrayList<Integer> arr) {
        double rez = 0;
        for (int i = 0; i < kolvo; i++) {
            rez = rez + arr.get(i);
        }
        return rez / kolvo;
    }

    public static double middleMarkD(int kolvo, ArrayList<Double> arr) {
        double rez = 0;
        for (int i = 0; i < kolvo; i++) {
            rez = rez + arr.get(i);
        }
        return rez / kolvo;
    }


    static class School {
        private String name;
        private Integer mark;

        private int numberOfSchool;
        private double math;
        private double rus;
        private double inf;
        private int count = 0;
        double obshiyMiddleBal;

        public School(String name, Integer mark) {
            this.name = name;
            this.mark = mark;
        }

        public String getName() {
            return name;
        }

        public Integer getMark() {
            return mark;
        }

        public School(int numberOfSchool, int math, int rus, int inf) {
            count = 1;
            this.numberOfSchool = numberOfSchool;
            this.math = math;
            this.rus = rus;
            this.inf = inf;
        }

        public void setNumberOfSchool(int numberOfSchool) {
            this.numberOfSchool = numberOfSchool;
        }

        public double getObshiyMiddleBal() {
            return obshiyMiddleBal;
        }

        public void setObshiyMiddleBal(double obshiyMiddleBal) {
            this.obshiyMiddleBal = obshiyMiddleBal;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = this.count + count;
        }

        public int getNumberOfSchool() {
            return numberOfSchool;
        }

        public double getMath() {
            return math;
        }

        public double getRus() {
            return rus;
        }

        public double getInf() {
            return inf;
        }

        public void setMath(int math) {
            this.math = this.math + math;
        }

        public void setRus(int rus) {
            this.rus = this.rus + rus;
        }

        public void setInf(int inf) {
            this.inf = this.inf + inf;
        }

        @Override
        public String toString() {
            String formattedDouble = String.format("%.1f", obshiyMiddleBal).replace(',', '.');
            String formattedDouble2 = String.format("%.1f", math / count).replace(',', '.');
            return "Школа № " + numberOfSchool + ": математика - " + formattedDouble2 + ", русский язык - " + rus / count + ", инфрматика - " + inf / count + ", общий средний балл - " + formattedDouble;
        }
    }
}