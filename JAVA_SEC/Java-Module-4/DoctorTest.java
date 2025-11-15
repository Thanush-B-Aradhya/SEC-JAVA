class Doctor {
    int consultationFee() {
        return 300;
    }
}

class Dentist extends Doctor {
    @Override
    int consultationFee() {
        return 500;
    }
}

class Cardiologist extends Doctor {
    @Override
    int consultationFee() {
        return 800;
    }
}

class Surgeon extends Doctor {
    @Override
    int consultationFee() {
        return 1000;
    }
}

public class DoctorTest {
    public static void main(String[] args) {

        Doctor general = new Doctor();
        System.out.println("General Doctor Fee: " + general.consultationFee());

        Doctor dentist = new Dentist();
        System.out.println("Dentist Fee: " + dentist.consultationFee());

        Doctor cardio = new Cardiologist();
        System.out.println("Cardiologist Fee: " + cardio.consultationFee());

        Doctor surgeon = new Surgeon();
        System.out.println("Surgeon Fee: " + surgeon.consultationFee());
    }
}
