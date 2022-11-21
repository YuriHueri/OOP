class Izone {

    public void Kpop() {

        System.out.println("Best Group Izone");
    }
}

class LeSserafim extends Izone {

    public void Kpop() {

        System.out.println("Best Group LeSserafim");
    }
}

class Ive extends Izone {

    public void Kpop() {

        System.out.println("Best Group Ive");
    }
}

class Main {

    public static void main(String[] args) {

        LeSserafim L1 = new LeSserafim();

        L1.Kpop();

        Ive I1 = new Ive();

        I1.Kpop();
    }
}
