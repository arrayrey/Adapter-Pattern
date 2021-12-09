public class Giok extends RingDec { //extends class RingDec
    public Giok(Ring ring) {
        super(ring); //method super akan mengidentifikasi object dari class Ring
    }

    public String decorate() {
        return super.decorate() + this.decorateWithGiok(); //method this akan mengidentifikasi object dari class Giok
    }

    public String decorateWithGiok() {
        return " and Giok's Ring"; //akan mengembalikan nilai dari Giok
    }
}

//class decorator kedua dari object decorator Ring