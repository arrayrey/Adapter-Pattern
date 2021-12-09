public abstract class RingDec implements Ring { //implements interface Ring
    private Ring ring;

    public RingDec(Ring ring) {
        this.ring = ring;
    }
    
    @Override //overide method decorate
    public String decorate() {
        return ring.decorate();
    }
}

//implements interface Ring dan override method decorate interface Ring