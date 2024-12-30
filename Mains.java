package DAY16_CW;
class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class Mains {
    public static void main(String[] args) {
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();

        ug.getDegree(); 
        pg.getDegree(); 
    }
}