public class Diamond extends RingDec { //extends class RingDec
    public Diamond(Ring ring) {
        super(ring); //method super akan mengidentifikasi object dari class Ring
    }

    public String decorate() {
        return super.decorate() + this.decorateWithDiamond(); //method this akan mengidentifikasi object dari class Diamond
    }

    public String decorateWithDiamond() {
        return "Diamond Ring"; //akan mengembalikan nilai dari Diamond
    }
}

//class decorator pertama dari object decorator Diamond (Ring)