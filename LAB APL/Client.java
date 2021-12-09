public class Client implements Observer { //implements class Observer
    private String pembeli;

    public Client (String pembeli) {
        this.pembeli = pembeli;
    }

    @Override //overide method update agar notifikasi diterima client
    public void update(String n) {
        Ring type = new Giok(new Diamond(new Type())); //implements decorator pattern
        System.out.println("New Ring model " + n + "Dear " + this.pembeli + ", come and get yours right now cause its limited, " + type.decorate() + "' at our store or via online."); 
        //this.pembeli berlaku untuk pembeli dan type.decorate berlaku untuk memanggil method decorate pada class type
    }

}

// class customer berguna sebagai observer, class ini juga berguna untuk implements Design Decorator Pattern
// method decorate berguna untuk mendekorasi class Diamond dan class Giok